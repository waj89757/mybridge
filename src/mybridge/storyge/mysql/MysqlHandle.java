package mybridge.storyge.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.PoolConfig;

import mybridge.protocal.impl.Protocal;
import mybridge.protocal.packet.*;
import mybridge.sql.parser.SqlLexer;
import mybridge.sql.parser.SqlParser;
import mybridge.storyge.Handle;
import mybridge.util.MysqlDefs;
import mybridge.util.MysqlTool;

public class MysqlHandle implements Handle {
	static Log logger = LogFactory.getLog(Protocal.class);
	static Pattern pattern = Pattern.compile("^(INSERT|CREATE|UPDATE|REPLACE|DELETE|DROP|ALTER|TRUNCT)");
	Connection master = null;
	Connection slave = null;
	String charset = "ASCII";
	List<ComboPooledDataSource> dsList = new ArrayList<ComboPooledDataSource>();
	

	public List<Packet> doCommand(PacketCommand cmd) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();

		logger.info("command:" + cmd.type);
		String sql = null;

		if (cmd.type != 3) {
			switch (cmd.type) {
			case MysqlDefs.COM_QUIT:
				break;
			case MysqlDefs.COM_INIT_DB:
				sql = "use " + cmd.value;
				break;
			default:
				packetList.add(new PacketEof());
				break;
			}
			if (sql == null) {
				return packetList;
			}
		}

		if (sql == null) {
			sql = cmd.value;
		}
		logger.info("sql:" + sql);

		// 执行sql
		Connection conn = getConnection(sql);
		if (conn == null) {
			throw new Exception("connect error");
		}
		SqlLexer lex = new SqlLexer(new ANTLRStringStream(sql));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		SqlParser g = new SqlParser(tokens);
		g.sql();
		System.out.println(g.sql);
		try {
			packetList = MysqlTool.query(conn, sql,charset);			 
		} catch (SQLException e) {
			PacketError error = new PacketError();
			error.errno = e.getErrorCode();
			error.sqlstate = e.getSQLState();
			error.message = e.getMessage();
			packetList.add(error);
		}
		return packetList;
	}

	Connection getConnection(String sql) throws SQLException {
		if (master != null) {
			return master;
		}

		Matcher matcher = pattern.matcher(sql);
		if (matcher.find()) {
			ComboPooledDataSource cpds = dsList.get(0);
			master = cpds.getConnection();
			return master;
		} else {
			if (slave != null) {
				return slave;
			} else {
				ComboPooledDataSource cpds = dsList.get(1);
				slave = cpds.getConnection();
				return slave;
			}
		}
	}

	public void init() {
		dsList.add(new ComboPooledDataSource("db0"));
		dsList.add(new ComboPooledDataSource("db1"));
	}

	public void destrory() {
		logger.info("close a session");
		if (master != null) {
			try {
				master.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (slave != null) {
			try {
				slave.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public String getCharSet() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

}
