package mybridge.core.config;

import java.util.HashMap;

import mybridge.core.handle.Table;

public class TableConfig {
	HashMap<String, Table> tables = new HashMap<String, Table>();

	public Table getTable(String db, String table) {
		return tables.get(db + "." + table);
	}

	public void addTable(Table table) {
		tables.put(table.getDb() + "." + table.getName(), table);
	}
}
