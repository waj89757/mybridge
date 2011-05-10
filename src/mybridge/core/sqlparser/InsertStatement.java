package mybridge.core.sqlparser;

public class InsertStatement extends Statement {
	ColList colList;
	Values values;

	public ColList getColList() {
		return colList;
	}

	public void setColList(ColList colList) {
		this.colList = colList;
	}

	public Values getValues() {
		return values;
	}

	public void setValues(Values values) {
		this.values = values;
	}

	public void setValueList(ValueList vl) {

	}

	public InsertStatement() {

	}

}
