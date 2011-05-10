package mybridge.core.sqlparser;
 

public class DeleteStatement extends Statement {
	Where where;

	public Where getWhere() {
		return where;
	}

	public void setWhere(Where where) {
		this.where = where;
	}

	public DeleteStatement() {

	}

}
