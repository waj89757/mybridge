package mybridge.protocal.packet;

/*
 The Packet Header
 Bytes                 Name
 -----                 ----
 3                     Packet Length
 1                     Packet Number

 Packet Length: The length, in bytes, of the packet
 that follows the Packet Header. There
 may be some special values in the most
 significant byte. Since 2**24 = MB,
 the maximum packet length is 16MB.

 Packet Number: A serial number which can be used to
 ensure that all packets are present
 and in order. The first packet of a
 client query will have Packet Number = 0
 Thus, when a new SQL statement starts,  
 the packet number is re-initialised.
 */
public class PacketHeader extends Packet {
	public final static int size = 4;
	public int packetLen;
	public byte packetNum;

	@Override
	public byte[] getBytes() {
		byte[] bs = new byte[4];
		bs[0] = (byte) ((packetLen) & 0xff);
		bs[1] = (byte) ((packetLen >> 8) & 0xff);
		bs[2] = (byte) ((packetLen >> 16) & 0xff);
		bs[3] = packetNum;
		return bs;
	}

	@Override
	public void putBytes(byte[] bs) {
		packetLen = (bs[0] & 0xff) | ((bs[1] & 0xff) << 8) | ((bs[2] & 0xff) << 16);
		packetNum = bs[3];
	}
}
