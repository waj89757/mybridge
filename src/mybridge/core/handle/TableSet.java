package mybridge.core.handle;

import java.util.HashMap;

public class TableSet {
	HashMap<String, Table> map = new HashMap<String, Table>();

	public void addTable(Table table) {
		map.put(table.getDb() + "." + table.getName(), table);
	}

	public Table getTable(String name) {
		return map.get(name);
	}
}
