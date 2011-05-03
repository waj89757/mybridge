package mybridge.storyge.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import mybridge.protocal.impl.Protocal;
import mybridge.protocal.packet.Packet;
import mybridge.protocal.packet.PacketCommand;
import mybridge.protocal.packet.PacketEof;
import mybridge.protocal.packet.PacketField;
import mybridge.protocal.packet.PacketOk;
import mybridge.protocal.packet.PacketResultSet;
import mybridge.protocal.packet.PacketRow;
import mybridge.storyge.Handle;

public class MysqlHandle implements Handle {
	static Log logger = LogFactory.getLog(Protocal.class);
	Connection conn = null;

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

		//执行sql
		conn = getConnection();
		// statement用来执行SQL语句
		Statement statement = conn.createStatement();
		if (statement.execute(sql) == false) {
			PacketOk ok = new PacketOk();
			ok.affectedRows = statement.getUpdateCount();
			packetList.add(ok);
			return packetList;
		}

		//返回结果集
		ResultSet rs = statement.getResultSet();
		ResultSetMetaData meta = rs.getMetaData();
		//result set packet
		PacketResultSet setPacket = new PacketResultSet();
		setPacket.fieldCount = meta.getColumnCount();
		packetList.add(setPacket);

		//field packets
		for (int i = 1; i <= meta.getColumnCount(); i++) {
			PacketField fieldPacket = new PacketField();
			fieldPacket.db = meta.getCatalogName(i);
			fieldPacket.table = meta.getTableName(i);
			fieldPacket.orgTable = meta.getTableName(i);
			fieldPacket.name = meta.getColumnName(i);
			fieldPacket.orgName = meta.getColumnName(i);
			fieldPacket.type = (byte) MysqlDefs.javaTypeToMysql(meta.getColumnType(i));
			fieldPacket.length = meta.getColumnDisplaySize(i);
			packetList.add(fieldPacket);
		}
		packetList.add(new PacketEof());

		while (rs.next()) {
			PacketRow rowPacket = new PacketRow();
			for (int i = 1; i <= meta.getColumnCount(); i++) {
				rowPacket.valueList.add(new String(rs.getBytes(i),"ASCII"));
			}
			packetList.add(rowPacket);
		}
		packetList.add(new PacketEof());
		return packetList;
	}

	Connection getConnection() throws Exception {
		if (conn == null) {
			// 驱动程序名
			String driver = "com.mysql.jdbc.Driver";
			// URL指向要访问的数据库名scutcs
			String url = "jdbc:mysql://127.0.0.1:3306/mysql";
			// MySQL配置时的用户名
			String user = "root";
			// MySQL配置时的密码
			String password = "";
			// 加载驱动程序
			Class.forName(driver);
			// 连续数据库
			conn = DriverManager.getConnection(url, user, password);
		}
		return conn;
	}

}
