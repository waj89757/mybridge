package mybridge.protocal;

import mybridge.util.Buffer;

public class PacketCommond extends Packet {
	public byte type;
	public String sql;
	
	@Override
	public byte[] getBytes() {
		return null;
	}

	@Override
	public void putBytes(byte[] bs) {
		Buffer buf = new Buffer(bs);
		type = buf.readByte();
		sql = buf.readRemainString();
	}

}
