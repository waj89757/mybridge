package mybridge.protocal.packet;

import mybridge.util.Buffer;

//Client Authentication Packet
//From client to server during initial handshake.
//VERSION 4.0
// Bytes                        Name
// -----                        ----
// 2                            client_flags
// 3                            max_packet_size
// n  (Null-Terminated String)  user
// 8                            scramble_buff
// 1                            (filler) always 0x00
// 
// VERSION 4.1
// Bytes                        Name
// -----                        ----
// 4                            client_flags
// 4                            max_packet_size
// 1                            charset_number
// 23                           (filler) always 0x00...
// n (Null-Terminated String)   user
// n (Length Coded Binary)      scramble_buff (1 + x bytes)
// n (Null-Terminated String)   databasename (optional)
// 
// client_flags:            CLIENT_xxx options. The list of possible flag
//                          values is in the description of the Handshake
//                          Initialisation Packet, for server_capabilities.
//                          For some of the bits, the server passed "what
//                          it's capable of". The client leaves some of the
//                          bits on, adds others, and passes back to the server.
//                          One important flag is: whether compression is desired.
//                          Another interesting one is CLIENT_CONNECT_WITH_DB,
//                          which shows the presence of the optional databasename.
// 
// max_packet_size:         the maximum number of bytes in a packet for the client
// 
// charset_number:          in the same domain as the server_language field that
//                          the server passes in the Handshake Initialization packet.
// 
// user:                    identification
// 
// scramble_buff:           the password, after encrypting using the scramble_buff
//                          contents passed by the server (see "Password functions"
//                          section elsewhere in this document)
//                          if length is zero, no password was given
// 
// databasename:            name of schema to use initially
// 
//The scramble_buff and databasename fields are optional. The length-coding byte for the scramble_buff will always be given, even if it's zero.
//Alternative terms: "Client authentication packet" is sometimes called "client auth response" or "client auth packet" or "login packet". "Scramble_buff" is sometimes called "crypted password".
//Relevant MySQL Source Code:
//- On the client side: libmysql/libmysql.c::mysql_real_connect().
//- On the server side: sql/sql_parse.cc::check_connections()
//Example Client Authentication Packet
//                    Hexadecimal                ASCII
//                    -----------                -----
//client_flags        85 a6 03 00                ....
//max_packet_size     00 00 00 01                ....
//charset_number      08                         .
//(filler)            00 00 00 00 00 00 00 00    ........
//                    00 00 00 00 00 00 00 00    ........
//                    00 00 00 00 00 00 00       .......
//user                70 67 75 6c 75 74 7a 61    pgulutza
//                    6e 00                      n.
//[edit] Password functions
//The Server Initialization Packet and the Client Authentication Packet both have an 8-byte field, scramble_buff. The value in this field is used for password authentication.
//Relevant MySQL Source Code: libmysql/password.c, see also comments at start of file. It works thus:
//[edit] 4.0 and before
//The server sends a random string to the client, in scramble_buff.
//The client encrypts the scramble_buff value using the hash of a password that the user has entered. This happens in sql/password.c:scramble() function.
//The client sends the encrypted scramble_buff value to the server.
//The server encrypts the original random string using a value in the mysql database, mysql.user.Password.
//The server compares its encrypted random string to what the client sent in scramble_buff.
//If they are the same, the password is okay.
//In this protocol, snooping on the wire doesn't reveal the password. But note the problem - if the client doesn't know the password, but knows a hash of it (as stored in mysql.user.Password) it can connect to the server. In other words, the hash of a password is the real password; if one can get the value of mysql.user.Password - he can connect to the server.
//[edit] 4.1 and later
//Remember that mysql.user.Password stores SHA1(SHA1(password))
//The server sends a random string (scramble) to the client
//the client calculates:
//stage1_hash = SHA1(password), using the password that the user has entered.
//token = SHA1(scramble + SHA1(stage1_hash)) XOR stage1_hash
//the client sends the token to the server
//the server calculates
//stage1_hash' = token XOR SHA1(scramble + mysql.user.Password)
//the server compares SHA1(stage1_hash') and mysql.user.Password
//If they are the same, the password is okay.
//(Note SHA1(A+B) is the SHA1 of the concatenation of A with B.)
//This protocol fixes the flaw of the old one, neither snooping on the wire nor mysql.user.Password are sufficient for a successful connection. But when one has both mysql.user.Password and the intercepted data on the wire, he has enough information to connect.
public class PacketAuth extends Packet {
	long clientFlag;
	long maxPacketSize;
	byte charsetNum;
	byte[] filler;
	String user;
	String scrambleBuf;
	String dbName;

	@Override
	public byte[] getBytes() {
		int len = 32 + scrambleBuf.getBytes().length + user.getBytes().length + dbName.getBytes().length;
		Buffer buf = new Buffer(len);
		buf.writeUInt32(clientFlag);
		buf.writeUInt32(maxPacketSize);
		buf.writeByte(charsetNum);
		buf.writeBytes(filler);
		buf.writeNullString(user);
		buf.writeLCString(scrambleBuf);
		buf.writeNullString(dbName);
		return null;
	}

	@Override
	public void putBytes(byte[] bs) {
		Buffer buf = new Buffer(bs);
		clientFlag = buf.readUInt32();
		maxPacketSize = buf.readUInt32();
		charsetNum = buf.readByte();
		filler = buf.readBytes(23);
		user = buf.readNullString();
		scrambleBuf = buf.readLCString();
		dbName = buf.readNullString();
	}
}
