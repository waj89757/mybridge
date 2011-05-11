package mybridge.core.table;

public class Row {
	Table table;
	String[] data;
	int size = 0;

	public Row(Table table) {
		this.data = new String[table.fieldList.size()];
	}

	public void add(int index, String value) throws Exception {
		if (table.fieldList.size() <= index) {
			throw new Exception("invalid index");
		}
		data[index] = value;
	}

	public void add(String name, String value) throws Exception {
		for (int i = 0; i < table.fieldList.size(); i++) {
			if (table.fieldList.get(i).name.equals(name)) {
				data[i] = value;
				return;
			}
		}
		throw new Exception("invalid name");
	}
}
