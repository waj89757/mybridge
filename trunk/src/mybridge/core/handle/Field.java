package mybridge.core.handle;

public class Field implements Cloneable {
	String name = "";
	int index;
	String value;
	long length;// 字段长度
	byte type;// 字段类型
	byte charset;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public byte getType() {
		return type;
	}

	public void setType(String type) {
		this.type = (byte) 253;
	}

	public byte getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = 8;
	}

	public Field clone() {
		try {
			return (Field) super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}
