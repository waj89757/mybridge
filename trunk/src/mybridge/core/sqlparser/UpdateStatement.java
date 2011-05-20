package mybridge.core.sqlparser;

import java.util.List;

public class UpdateStatement extends Statement {
	List<String> colList;
	Where where;
	Values values;

	public Where getWhere() {
		return where;
	}

	public void setWhere(Where where) {
		this.where = where;
	}

	public List<String> getCols() {
		return colList;
	}

	public void setColList(List<String> cols) {
		this.colList = cols;
	}
	public Values getValues() {
		return values;
	}
	public void setValues(Values values) {
		this.values = values;
	}
	public UpdateStatement() {

	}

}
