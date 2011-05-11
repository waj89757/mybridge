package mybridge.core.packet;

import java.util.ArrayList;
import java.util.List;

import mybridge.util.Buffer;

public class PacketRow extends Packet {
	String charset = "utf8";
	List<String> valueList = new ArrayList<String>();

	public PacketRow(String charset) {
		this.charset = charset;
	}

	@Override
	public byte[] getBytes() {
		int len = 0;
		for (String value : valueList) {
			len += Buffer.getLCStringLen(value, charset);
		}
		Buffer buf = new Buffer(len);
		for (String value : valueList) {
			buf.writeLCString(value, charset);
		}
		return buf.getBytes();
	}

	public void addValue(String value) {
		valueList.add(value);
	}

	@Override
	public void putBytes(byte[] bs) {
	}

}
