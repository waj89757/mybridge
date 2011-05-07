package mybridge.engine;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import mybridge.handle.memcache.McHandle;
import mybridge.protocal.impl.Protocal;
import mybridge.protocal.packet.*;
import mybridge.sql.SqlLexer;
import mybridge.sql.SqlParser;
import mybridge.sql.SqlStatement;
import mybridge.util.MysqlDefs;

public class DefaultEngine implements Engine {
	static Log logger = LogFactory.getLog(Protocal.class);
	static Pattern pattern = Pattern.compile("^(INSERT|CREATE|UPDATE|REPLACE|DELETE|DROP|ALTER|TRUNCT)");
	static HashMap<String, Handle> handleMap = new HashMap<String, Handle>();
	static {
		try {
			McHandle handle = new McHandle("test", "mc3");
			handle.pk = "id1";
			String key = handle.db + "_" + handle.table;
			handleMap.put(key, handle);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	String db = "";
	Connection conn = null;
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
				db = cmd.value;
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

		SqlStatement stat = parseSql(sql);
		if (stat.db.length() == 0) {
			stat.db = db;
		}
		String key = stat.db + "_" + stat.table;
		if (!handleMap.containsKey(key)) {
			//直接走mysql
			try {
				// 执行sql
				if (conn == null) {
					conn = MysqlHelper.getConnection(sql);
				}
				if (conn == null) {
					throw new Exception("connect error");
				}
				packetList = MysqlHelper.query(conn, sql, charset);
			} catch (SQLException e) {
				PacketError error = new PacketError();
				error.errno = e.getErrorCode();
				error.sqlstate = e.getSQLState();
				error.message = e.getMessage();
				packetList.add(error);
			}
			return packetList;
		}

		//走其他存储引擎
		Handle handle = handleMap.get(key);
		try {
			packetList = handle.execute(stat);
		} catch (SQLException e) {
			PacketError error = new PacketError();
			error.errno = 2000;
			error.message = e.getMessage();
			packetList.add(error);
		}
		return packetList;
	}

	SqlStatement parseSql(String sql) throws RecognitionException {
		SqlLexer lex = new SqlLexer(new ANTLRStringStream(sql));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		SqlParser parser = new SqlParser(tokens);
		parser.sql();
		SqlStatement stat = parser.sql;
		logger.debug(stat);
		return stat;
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
