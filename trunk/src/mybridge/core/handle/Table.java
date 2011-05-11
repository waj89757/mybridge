package mybridge.core.handle;

import java.util.ArrayList;
import java.util.List;

public class Table {
	List<Field> fieldList = new ArrayList<Field>();
	String db;
	String name;

	public List<Field> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}

	public void addField(Field field) {
		this.fieldList.add(field);
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
