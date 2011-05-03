package mybridge.protocal.packet;

import mybridge.util.Buffer;

public class PacketCommand extends Packet {
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
