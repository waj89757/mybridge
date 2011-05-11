package mybridge.handle.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import mybridge.core.handle.Field;
import mybridge.core.handle.Handle;
import mybridge.core.handle.ResultSet;
import mybridge.core.sqlparser.Cond;
import mybridge.core.sqlparser.Limit;
import mybridge.core.sqlparser.Order;

public class ExampleHandle extends Handle {
	static HashMap<String, ArrayList<HashMap<String, String>>> data = new HashMap<String, ArrayList<HashMap<String, String>>>();

	public List<HashMap<String, String>> getData() {
		if (!data.containsKey(table.getName())) {
			data.put(table.getName(), new ArrayList<HashMap<String, String>>());
		}
		return data.get(table.getName());
	}

	@Override
	public int doDelete(List<Cond> where) throws Exception {
		int count = 0;
		Iterator<HashMap<String, String>> it = getData().iterator();
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
	public int doInsert(List<Field> fieldList) throws Exception {
		HashMap<String, String> rowMap = new HashMap<String, String>();
		for (Field field : fieldList) {
			rowMap.put(field.getName(), field.getValue());
		}
		getData().add(rowMap);
		return 1;
	}

	@Override
	public ResultSet doSelect(List<Field> fieldList, List<Cond> where,
			Order order, Limit limit) throws Exception {
		ResultSet rs = new ResultSet();
		int count = 0;
		Iterator<HashMap<String, String>> it = getData().iterator();
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
	public int doUpdate(List<Field> fieldList, List<Cond> where)
			throws Exception {
		ResultSet rs = new ResultSet();
		int count = 0;
		Iterator<HashMap<String, String>> it = getData().iterator();
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
}
