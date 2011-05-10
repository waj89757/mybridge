package mybridge.core.sqlparser;

import java.util.HashMap;

public class Values {
	public HashMap<String, String> data = new HashMap<String, String>();

	public void add(String col, String val) {
		data.put(col, val);
	}
}
