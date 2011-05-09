package mybridge.core.packet;

import java.util.ArrayList;
import java.util.List;

import mybridge.util.Buffer;

public class PacketRow extends Packet {
	public List<String> valueList = new ArrayList<String>();

	@Override
	public byte[] getBytes() {
		int len = 0;
		for (String value : valueList) {
			len += Buffer.getLCStringLen(value);
		}
		Buffer buf = new Buffer(len);
		for (String value : valueList) {
			buf.writeLCString(value);
		}
		return buf.getBytes();
	}

	@Override
	public void putBytes(byte[] bs) {
	}

}
