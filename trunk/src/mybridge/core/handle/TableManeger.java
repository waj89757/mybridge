package mybridge.core.handle;

import java.io.File;
import java.io.IOException; 

import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;

import mybridge.handle.example.ExampleTable;

public class TableManeger {
	public static TableSet tableSet;

	static {
		reload();
	}

	public static void reload() {
		Digester digester = new Digester();
		digester.setValidating(false);
		digester.addObjectCreate("tableset", "mybridge.core.handle.TableSet");
		digester.addSetProperties("tableset");

		digester.addObjectCreate("tableset/table", "mybridge.core.handle.Table");
		digester.addSetProperties("tableset/table");
		digester.addSetNext("tableset/table", "addTable", "mybridge.core.handle.Table");

		digester.addObjectCreate("tableset/table/field", "mybridge.core.handle.Field");
		digester.addSetProperties("tableset/table/field");
		digester.addSetNext("tableset/table/field", "addField", "mybridge.core.handle.Field");

		try {
			tableSet = (TableSet) digester.parse(new File("./conf/table.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}

	public static Table getTable(String db, String table) {
		return tableSet.getTable(db + "." + table);
	}

	public static Handle getHandle() {
		return new ExampleTable();
	}
}
