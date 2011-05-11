package mybridge.core.sqlparser;

public class SetNamesStatement extends Statement {
	String charset = "utf8";

	public String getCharset() {
		return charset;
	}

	public void setCharset(String value) {
		if (value.startsWith("\"") || value.startsWith("'")) {
			value = value.substring(1);
			value = value.substring(0, value.length() - 1);
		}
		this.charset = value;
	}

}
