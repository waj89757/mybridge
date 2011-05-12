package mybridge.core.handle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResultSet {
	List<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
	HashMap<String, String> row;
	int size = 0;

	/**
	 * 添加一行数据
	 */
	public void addNewRow() {
		row = new HashMap<String, String>();
		data.add(row);
	}

	/**
	 * 当前行中添加列值
	 * @param field 字段
	 * @param value 值
	 * @throws Exception
	 */
	public void add(Field field, String value) throws Exception {
		row.put(field.getName(), value);
	}
}
