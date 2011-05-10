package mybridge.table.example;
 
import java.util.ArrayList;
import java.util.List;

import mybridge.core.sqlparser.ColList;
import mybridge.core.sqlparser.Limit;
import mybridge.core.sqlparser.Order;
import mybridge.core.sqlparser.Values;
import mybridge.core.sqlparser.Where;
import mybridge.core.table.Field;
import mybridge.core.table.Row;
import mybridge.core.table.Table;

public class ExampleTable extends Table {

	public ExampleTable(String db, String table) {
		super(db, table);
	}

	@Override
	public int doDelete(Where where) throws Exception {
		return 0;
	}

	@Override
	public int doInsert(ColList colList, Values values) throws Exception {
		return 0;
	}

	@Override
	public List<Row> doSelect(ColList colList, Where where, Order order,
			Limit limit) throws Exception {
		List<Row> rowList = new ArrayList<Row>();
		int count = 2;
		for (int i = 0; i < count; i++) {
			Row row = this.createNewRow();
			for (Field field : fieldList) {
				row.add(field.name, "abc");
			}
			rowList.add(row);
		}
		return rowList;
	}

	@Override
	public int doUpdate(Values values, Where where) throws Exception {
		return 0;
	}

}
