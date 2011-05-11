package mybridge.core.table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResultSet {
	List<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
	HashMap<String, String> row;
	int size = 0;

	public void addNewRow() {
		row = new HashMap<String, String>();
		data.add(row);
	}

	public void add(Field field, String value) throws Exception {
		row.put(field.getName(), value);
	}
}
