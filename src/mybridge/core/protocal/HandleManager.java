package mybridge.core.protocal;

import gudusoft.gsqlparser.EDbVendor;
import gudusoft.gsqlparser.TGSqlParser;

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

import mybridge.core.packet.*;
import mybridge.core.protocal.Engine;
import mybridge.core.protocal.Handle;
import mybridge.core.protocal.Protocal;
import mybridge.core.sqlparser.SqlLexer;
import mybridge.core.sqlparser.SqlParser;
import mybridge.core.sqlparser.SqlStatement;
import mybridge.handle.memcache.McHandle;
import mybridge.util.MysqlDefs;

public class HandleManager {
	static Log logger = LogFactory.getLog(HandleManager.class);
	static HashMap<String, Handle> handleMap = new HashMap<String, Handle>();
	static TGSqlParser sqlparser = new TGSqlParser(EDbVendor.dbvmysql);

	String db = "";
	String charset = "UTF-8";

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
			}
			if (sql == null) {
				packetList.add(new PacketEof());
				return packetList;
			}
		}

		if (sql == null) {
			sql = cmd.value;
		}
		sqlparser.sqltext = sql;
		sqlparser.parse();

		long start = System.currentTimeMillis();
		sqlparser.parse();

		logger.info("sql:" + sql);

		return packetList;
	}

}
