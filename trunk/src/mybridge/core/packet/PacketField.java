package mybridge.core.packet;


public class PacketField extends Packet {
	public String catalog = "def";
	public String db = "";
	public String table = "";
	public String orgTable = "";
	public String name = "";
	public String orgName = "";
	public byte fill1 = 0x0c;//影响client 显示格式
	public int charsetnr = 0x08;
	public long length;
	public byte type;
	public int flag = 0;
	public byte decimals = 0;
	public byte[] fill2 = new byte[2];

	@Override
	public byte[] getBytes() {
		int len = Buffer.getLCStringLen(catalog) + Buffer.getLCStringLen(db) + Buffer.getLCStringLen(table) + Buffer.getLCStringLen(orgTable) + Buffer.getLCStringLen(name) + Buffer.getLCStringLen(orgName) + 13;
		Buffer buf = new Buffer(len);
		buf.writeLCString(catalog);
		buf.writeLCString(db);
		buf.writeLCString(table);
		buf.writeLCString(orgTable);
		buf.writeLCString(name);
		buf.writeLCString(orgName);
		buf.writeByte(fill1);
		buf.writeUInt16(charsetnr);
		buf.writeUInt32(length);
		buf.writeByte(type);
		buf.writeUInt16(flag);
		buf.writeByte(decimals);
		buf.writeBytes(fill2);
		return buf.getBytes();
	}

	@Override
	public void putBytes(byte[] bs) {
	}

}
