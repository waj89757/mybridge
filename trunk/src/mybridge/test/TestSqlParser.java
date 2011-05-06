package mybridge.test;

import java.io.StringReader;

import gudusoft.gsqlparser.EDbVendor;
import gudusoft.gsqlparser.TCustomSqlStatement;
import gudusoft.gsqlparser.TGSqlParser;
import gudusoft.gsqlparser.stmt.TAlterTableStatement;
import gudusoft.gsqlparser.stmt.TCreateTableSqlStatement;

import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.Select;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import mybridge.sql.parser.SqlLexer;
import mybridge.sql.parser.SqlParser;
import junit.framework.TestCase;

public class TestSqlParser extends TestCase {
	public void testSqlParser() throws Exception {
		//parseSql("select a,b,c,d from aaa where a=111 and b=\"222\" and c in(1,2,3)");
		//parseSql("insert into( a,b,c,d)values(111,\"222\")");
		//parseSql("update table1 set a=111 , b=\"222\" where a=111 and b=\"222\"");
		//parseSql("delete from table1 where a=111 and b=\"222\"");

		String sql = "select a,b,c,d from aaa where a=111 and b=\"222\" and c in(1,2,3)";
		CCJSqlParserManager parser = new CCJSqlParserManager();
		Statement stat = parser.parse(new StringReader(sql));
		Select select = (Select)stat;
		select.getSelectBody().accept(arg0);
		

		TGSqlParser sqlparser = new TGSqlParser(EDbVendor.dbvoracle);
		sqlparser.sqltext = "select a,b,c,d from aaa where a=111 and b=\"222\" and c in(1,2,3)";
		int ret = sqlparser.parse();
		if (ret == 0) {
			for (int i = 0; i < sqlparser.sqlstatements.size(); i++) {
				analyzeStmt(sqlparser.sqlstatements.get(i));
				System.out.println("");
			}
		} else {
			System.out.println(sqlparser.getErrormessage());
		}

	}

	protected void analyzeStmt(TCustomSqlStatement stmt) {
		System.out.println(stmt);

	}

	void parseSql(String sql) throws RecognitionException {
		SqlLexer lex = new SqlLexer(new ANTLRStringStream(sql));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		SqlParser g = new SqlParser(tokens);
		g.statement();
		System.out.println(g.sql);
	}
}
