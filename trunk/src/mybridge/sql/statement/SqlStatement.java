package mybridge.sql.statement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SqlStatement {
	public static int INVALID = -1;
	public static int SELECT = 0;
	public static int INSERT = 1;
	public static int REPLACE = 2;
	public static int UPDATE = 3;
	public static int DELETE = 4;

	public int type = INVALID;
	public String table;
	public Map<String, String> value = new HashMap<String, String>();
	public Map<String, String> where = new HashMap<String, String>();
	public Set<String> fields = new HashSet<String>();
	
	
}
