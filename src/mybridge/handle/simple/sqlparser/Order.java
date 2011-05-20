package mybridge.handle.simple.sqlparser;

public class Order {
	public static int ASC = 1;
	public static int DESC = 2;
	public String col;
	public int flag = ASC;

	public void setFlag(String val) {
		if (val.toLowerCase().equals("desc")) {
			flag = DESC;
		}
	}
}
