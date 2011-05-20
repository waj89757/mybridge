package mybridge.handle.simple.sqlparser;

public abstract class Statement {
	String db = "";
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	String table = "";
}
