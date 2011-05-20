package mybridge.handle.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import mybridge.core.sqlparser.Cond;
import mybridge.core.sqlparser.Limit;
import mybridge.core.sqlparser.Order;
import mybridge.handle.simple.BaseHandle;
import mybridge.handle.simple.Field;
import mybridge.handle.simple.ResultSet;
import mybridge.handle.simple.Table;

public class Handle extends BaseHandle {
	static HashMap<String, ArrayList<HashMap<String, String>>> data = new HashMap<String, ArrayList<HashMap<String, String>>>();

	List<HashMap<String, String>> getData(String tableName) {
		if (!data.containsKey(tableName)) {
			data.put(tableName, new ArrayList<HashMap<String, String>>());
		}
		return data.get(tableName);
	}

	@Override
	public int doDelete(String table, List<Cond> where) throws Exception {
		int count = 0;
		Iterator<HashMap<String, String>> it = getData(table).iterator();
		while (it.hasNext()) {
			HashMap<String, String> rowMap = it.next();
			boolean condResult = true;
			for (Cond cond : where) {
				if (cond.op == Cond.EQ && !cond.val.equals(rowMap.get(cond.col))) {
					condResult = false;
					break;
				}
			}
			if (!condResult) {
				continue;
			}
			it.remove();
			count++;
		}
		return count;
	}

	@Override
	public int doInsert(String table, List<Field> fieldList) throws Exception {
		HashMap<String, String> rowMap = new HashMap<String, String>();
		for (Field field : fieldList) {
			rowMap.put(field.getName(), field.getValue());
		}
		getData(table).add(rowMap);
		return 1;
	}

	@Override
	public ResultSet doSelect(String table, List<Field> fieldList, List<Cond> where, Order order, Limit limit) throws Exception {
		ResultSet rs = new ResultSet();
		int count = 0;
		Iterator<HashMap<String, String>> it = getData(table).iterator();
		while (it.hasNext()) {
			HashMap<String, String> rowMap = it.next();
			boolean condResult = true;
			for (Cond cond : where) {
				if (cond.op == Cond.EQ && !cond.val.equals(rowMap.get(cond.col))) {
					condResult = false;
					break;
				}
			}
			if (!condResult) {
				continue;
			}

			rs.addNewRow();
			for (Field field : fieldList) {
				if (rowMap.containsKey(field.getName())) {
					rs.add(field, rowMap.get(field.getName()));
				}
			}
			count++;
		}
		return rs;
	}

	@Override
	public int doUpdate(String table, List<Field> fieldList, List<Cond> where) throws Exception {
		ResultSet rs = new ResultSet();
		int count = 0;
		Iterator<HashMap<String, String>> it = getData(table).iterator();
		while (it.hasNext()) {
			HashMap<String, String> rowMap = it.next();
			boolean condResult = true;
			for (Cond cond : where) {
				if (cond.op == Cond.EQ && !cond.val.equals(rowMap.get(cond.col))) {
					condResult = false;
					break;
				}
			}
			if (!condResult) {
				continue;
			}

			rs.addNewRow();
			for (Field field : fieldList) {
				rowMap.put(field.getName(), field.getValue());
			}
			count++;
		}
		return count;
	}

	public Table getTable(String db, String table) throws Exception {
		return TableConfig.getTable(db, table);
	}
}
