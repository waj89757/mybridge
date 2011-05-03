package mybridge.protocal;

import mybridge.util.Buffer;

public class PacketOk extends Packet {
	public byte type = 0;
	public long affectedRows = 0;
	public long insertId = 0;
	public int serverStatus = 0;
	public int warningCount = 0;
	public String message = "";

	@Override
	public byte[] getBytes() {
		int len = 1 + Buffer.getLCBLen(affectedRows) + Buffer.getLCBLen(insertId) + 4 + message.getBytes().length;
		Buffer buf = new Buffer(len);
		buf.writeByte(type);
		buf.writeLCB(affectedRows);
		buf.writeLCB(insertId);
		buf.writeUInt16(serverStatus);
		buf.writeUInt16(warningCount);
		buf.writeRemainString(message);
		return buf.getBytes();
	}

	@Override
	public void putBytes(byte[] bs) {

	}

}
