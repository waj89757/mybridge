package mybridge.protocal.packet;

import mybridge.util.Buffer;

public class PacketError extends Packet {
	public byte type = (byte) 0xff;
	public int errno = 0;
	public byte sqlStateMark = 0x23;
	public String sqlstate = "12345";
	public String message = "";

	@Override
	public byte[] getBytes() {
		int len = 9 + message.getBytes().length;
		Buffer buf = new Buffer(len);
		buf.writeByte(type);
		buf.writeUInt16(errno);
		buf.writeByte(sqlStateMark);
		buf.writeBytes(sqlstate.getBytes());
		buf.writeRemainString(message);
		return buf.getBytes();
	}

	@Override
	public void putBytes(byte[] bs) {
	}

}
