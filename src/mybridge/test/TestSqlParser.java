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
		parseSql("select a,b,c,d from aaa where a=2.23 and b=\"222\" and c in(1,2,3)");
		parseSql("insert into aaa ( a,b,c,d)values(1,\"222\",2,3)");
		parseSql("update aaa set a=111 , b=\"222\" where a=1 and b=\"222\" and c in(1,2,3)");
		parseSql("delete from table1 where a=111 and b=\"222\" and c in(1,2,3)");
	}

	protected void analyzeStmt(TCustomSqlStatement stmt) {
		System.out.println(stmt);
	}

	void parseSql(String sql) throws RecognitionException {
		SqlLexer lex = new SqlLexer(new ANTLRStringStream(sql));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		SqlParser g = new SqlParser(tokens);
		g.sql();
		System.out.println(g.parseOk);
		System.out.println(g.sql);
	}
}
