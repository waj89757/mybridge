package mybridge.handle.simple.sqlparser;

import java.util.ArrayList;
import java.util.List;

public class ValueList {
	List<String> valueList = new ArrayList<String>();

	public void add(String value) {
		if (value.startsWith("\"") || value.startsWith("'")) {
			value = value.substring(1);
			value = value.substring(0, value.length() - 1);
		}
		valueList.add(value);
	}
}
