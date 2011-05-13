package mybridge.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJdbc {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8306/", "user", "passwd");
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("insert into useracct(username) values(\"qwgqq\")");
		ResultSet rs = stmt.executeQuery("select * from useracct");
		while (rs.next()) {
			System.out.println(rs.getString(2));
		}
	}
}
