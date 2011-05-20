package mybridge.handle.example;

import java.io.File;
import java.util.HashMap;

import org.apache.commons.digester.Digester;

import mybridge.handle.simple.Field;
import mybridge.handle.simple.Table;

public class TableConfig {
	static TableConfig tableConfig;
	static HashMap<String, Table> tables = new HashMap<String, Table>();

	public static void init() throws Exception {
		Digester digester = new Digester();
		digester.setValidating(false);
		digester.addObjectCreate("mybridge/tableset", TableConfig.class.getName());
		digester.addSetProperties("mybridge/tableset");
		digester.addObjectCreate("mybridge/tableset/table", Table.class);
		digester.addSetProperties("mybridge/tableset/table");
		digester.addSetNext("mybridge/tableset/table", "addTable", Table.class.getName());

		digester.addObjectCreate("mybridge/tableset/table/field", Field.class.getName());
		digester.addSetProperties("mybridge/tableset/table/field");
		digester.addSetNext("mybridge/tableset/table/field", "addField", Field.class.getName());
		tableConfig = (TableConfig) digester.parse(new File("./conf/server.xml"));
	}

	public static Table getTable(String db, String table) {
		return tables.get(db + "." + table);
	}

	public void addTable(Table table) {
		tables.put(table.getDb() + "." + table.getName(), table);
	}
}
