package mybridge.core.table;
 

import mybridge.table.example.ExampleTable;

public class TableManeger {
	public static Table getTable(String db, String table) {
		return new ExampleTable("", "");
	}
}
