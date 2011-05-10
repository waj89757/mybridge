package mybridge.core.sqlparser;

public class SelectStatement extends Statement {
	public ColList colList;
	public Order order;
	public Limit limit;
	public Where where;

	public ColList getColList() {
		return colList;
	}

	public void setColList(ColList colList) {
		this.colList = colList;
	}

	public Where getWhere() {
		return where;
	}

	public void setWhere(Where where) {
		this.where = where;
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

	public SelectStatement() {

	}

}
