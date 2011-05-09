package mybridge.core.packet;

import mybridge.util.Buffer;

public class PacketEof extends Packet {
	public byte type = (byte) 0xfe;
	public int warningCount = 0;
	public int statusFlags = 0;

	@Override
	public byte[] getBytes() {
		int len = 5;
		Buffer buf = new Buffer(len);
		buf.writeByte(type);
		buf.writeUInt16(warningCount);
		buf.writeUInt16(statusFlags);
		return buf.getBytes();
	}

	@Override
	public void putBytes(byte[] bs) {
	}

}
