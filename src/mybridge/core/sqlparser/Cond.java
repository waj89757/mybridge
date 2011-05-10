package mybridge.core.sqlparser;

/**
 * 条件语句
 * @author quanwei
 *
 */
public class Cond {
	public static int GT = 1;
	public static int GE = 2;
	public static int LT = 3;
	public static int LE = 4;
	public static int EQ = 5;
	public static int NE = 6;

	public String col;
	public String val;
	public int op;

	public Cond(String col, String op, String val) {
		this.col = col;
		this.val = val;
		if (op.equals(">")) {
			this.op = GT;
		} else if (op.equals(">=")) {
			this.op = GE;
		} else if (op.equals("=")) {
			this.op = EQ;
		} else if (op.equals("<=")) {
			this.op = LE;
		} else if (op.equals("<")) {
			this.op = LT;
		} else if (op.equals("!=")) {
			this.op = NE;
		} else {
			this.op = GE;
		}
	} 
}
