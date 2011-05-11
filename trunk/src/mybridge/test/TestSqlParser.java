package mybridge.test;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import mybridge.core.sqlparser.SqlLexer;
import mybridge.core.sqlparser.SqlParser;
import junit.framework.TestCase;

public class TestSqlParser extends TestCase {
	public void testSqlParser() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			parseSql("select a,b,c,d from aaa where a=2.23 and b=\"222\" ");
			parseSql("select a,b,c,d from mysql.user where a=2.23 and b=\"222\" ");
			parseSql("select a,b,c,d from `mysql`.user where a=2.23 and b=\"222\" ");
			parseSql("select a,b,c,d from `mysql`.`user` where a=2.23 and b=\"222\" ");
			parseSql("insert into aaa ( a,b,c,d)values(1,\"222\",2,3)");
			parseSql("update aaa set a=111 , b=\"222\" where a=1 and b=\"222\" ");
			parseSql("delete from table1 where a=111 and b=\"222\" ");
			parseSql("insert sf111 and b=\"222\" ");
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	void parseSql(String sql) {
		SqlLexer lex = new SqlLexer(new ANTLRStringStream(sql));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		SqlParser parser = new SqlParser(tokens);
		try {
			parser.parse();
		} catch (RecognitionException e) {
			//System.out.println(e);
			//e.printStackTrace();
		}
		//System.out.println(parser.getStatement());
	}
}
