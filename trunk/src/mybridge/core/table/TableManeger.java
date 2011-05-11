package mybridge.core.table;
 

import java.util.ArrayList;
import java.util.List;

import mybridge.table.example.ExampleTable;

public class TableManeger {
	public static List<Field> getTableFields(String db, String table) {
		List<Field> flist = new ArrayList<Field>();
		Field f = new Field();
		f.name = "a";
		f.value = "";
		f.length = 32;
		f.type = (byte) 253;
		f.charset = "utf8";
		flist.add(f);
		f = new Field();
		f.name = "b";
		f.value = "";
		f.length = 32;
		f.type = (byte) 253;
		f.charset = "utf8";
		flist.add(f);
		return flist;
	}
	public static Handle getTable() {
		return new ExampleTable();
	}
}
