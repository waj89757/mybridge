package mybridge.table.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import mybridge.core.sqlparser.Cond;
import mybridge.core.sqlparser.Limit;
import mybridge.core.sqlparser.Order;
import mybridge.core.table.Field;
import mybridge.core.table.ResultSet;
import mybridge.core.table.Handle;

public class ExampleTable extends Handle {
	static List<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();

	@Override
	public int doDelete(List<Cond> where) throws Exception {
		int count = 0;
		Iterator<HashMap<String, String>> it = data.iterator();
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
				it.remove();
				count++;
			}
		}
		return count;
	}

	@Override
	public int doInsert(List<Field> fieldList) throws Exception {
		HashMap<String, String> rowMap = new HashMap<String, String>();
		for (Field field : fieldList) {
			rowMap.put(field.getName(), field.getValue());
		}
		data.add(rowMap);
		return 1;
	}

	@Override
	public ResultSet doSelect(List<Field> fieldList, List<Cond> where,
			Order order, Limit limit) throws Exception {
		ResultSet rs = new ResultSet();
		int count = 0;
		Iterator<HashMap<String, String>> it = data.iterator();
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
		throw new Exception("not support update operation for example table");
	}
}
