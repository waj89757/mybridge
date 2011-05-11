package mybridge.core.sqlparser;

import java.util.HashMap;

public class Values {
	public HashMap<String, String> data = new HashMap<String, String>();

	public void add(String col, String value) {
		if (value.startsWith("\"") || value.startsWith("'")) {
			value = value.substring(1);
			value = value.substring(0, value.length() - 1);
		}
		data.put(col, value);
	}
}
