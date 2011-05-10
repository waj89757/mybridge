package mybridge.core.protocal;

import java.util.ArrayList;
import java.util.List;

import mybridge.core.packet.Packet;
import mybridge.core.packet.PacketCommand;
import mybridge.core.packet.PacketEof;
import mybridge.core.packet.PacketOk;
import mybridge.core.sqlparser.SelectStatement;
import mybridge.core.sqlparser.SqlLexer;
import mybridge.core.sqlparser.SqlParser;
import mybridge.core.sqlparser.Statement;
import mybridge.core.table.Table;
import mybridge.core.table.TableManeger;
import mybridge.util.MysqlDefs;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Connection {
	static Log logger = LogFactory.getLog(Connection.class);

	public String db = "";
	public String charset = "UTF-8";

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
		logger.info("sql:" + sql);
		try {
			Statement stat = parseSql(sql);
			if (stat instanceof SelectStatement) {
				Table tb = TableManeger.getTable(db, stat.getTable());
				packetList = tb.select((SelectStatement) stat);
			}
		} catch (Exception e) {
			PacketOk ok = new PacketOk();
			ok.affectedRows = 0;
			packetList.add(ok);
		}

		return packetList;
	}

	Statement parseSql(String sql) throws RecognitionException {
		SqlLexer lex = new SqlLexer(new ANTLRStringStream(sql));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		SqlParser parser = new SqlParser(tokens);
		parser.parse();
		return parser.getStatement();
	}

	public void init() {
	}

	public void destrory() {
	}
}
