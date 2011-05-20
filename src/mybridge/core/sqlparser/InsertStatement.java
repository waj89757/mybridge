package mybridge.core.sqlparser;

import java.util.List;

public class InsertStatement extends Statement {
	ColList colList;
	Values values;

	public List<String> getCols() {
		return colList.getCols();
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
		if (vl.valueList.size() == colList.cols.size()) {
			values = new Values();
			for (int i = 0; i < colList.cols.size(); i++) {
				values.data.put(colList.cols.get(i), vl.valueList.get(i));
			}
		}

	}

	public InsertStatement() {

	}

}
