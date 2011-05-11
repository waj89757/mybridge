package mybridge.core.packet;

import mybridge.util.Buffer;

public class PacketCommand extends Packet {
	public byte type;
	public byte[] value;

	@Override
	public byte[] getBytes() {
		return null;
	}

	@Override
	public void putBytes(byte[] bs) {
		Buffer buf = new Buffer(bs);
		type = buf.readByte();
		value = buf.readRemainBytes();
	}

}
