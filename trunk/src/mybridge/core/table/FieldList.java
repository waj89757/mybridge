package mybridge.core.table;

import java.util.ArrayList;
import java.util.List;

public class FieldList {
	public List<Field> fieldList = new ArrayList<Field>();
	public String db;
	public String table;
	public List<Field> getFieldList() {
		return fieldList;
	}
	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getName() {
		return table;
	}
	public void setName(String table) {
		this.table = table;
	}
	public void addField(Field field) {
		fieldList.add(field);
	}
}
