package mybridge.core.sqlparser;

import java.util.List;

public class SelectStatement extends Statement {
	ColList colList;
	Order order;
	Limit limit;
	Where where = new Where();

	public List<String> getCols() {
		return colList.getCols();
	}

	public void setColList(ColList colList) {
		this.colList = colList;
	}

	public Where getWhere() {
		return where;
	}

	public void setWhere(Where where) {
		if (where != null) {
			this.where = where;
		}
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Limit getLimit() {
		return limit;
	}

	public void setLimit(Limit limit) {
		this.limit = limit;
	} 

}
