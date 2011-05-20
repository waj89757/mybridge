package mybridge.core.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import mybridge.core.packet.Packet;
import mybridge.core.packet.PacketEof;
import mybridge.core.packet.PacketField;
import mybridge.core.packet.PacketOk;
import mybridge.core.packet.PacketResultSet;
import mybridge.core.packet.PacketRow;

public class MysqlHelper {
	/**
	 * 获取主库连接
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public static Connection getMasterConnection() throws SQLException {
		ComboPooledDataSource cpds = new ComboPooledDataSource("db0");
		return cpds.getConnection();
	}

	/**
	 * 获取从库连接
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public static Connection getSlaveConnection() throws SQLException {
		ComboPooledDataSource cpds = new ComboPooledDataSource("db1");
		return cpds.getConnection();
	}

	public static Connection getConnection(String sql) throws SQLException {
		ComboPooledDataSource cpds = new ComboPooledDataSource("db1");
		return cpds.getConnection();
	}

	/**
	 * 在mysql中执行sql，并返回resultset packet
	 * 
	 * @param conn
	 * @param sql
	 * @param charset
	 * @return
	 * @throws Exception
	 */
	public static List<Packet> query(Connection conn, String sql, String charset)
			throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();
		// statement用来执行SQL语句
		Statement statement = conn.createStatement();
		if (statement.execute(sql) == false) {
			PacketOk ok = new PacketOk();
			ok.affectedRows = statement.getUpdateCount();
			packetList.add(ok);
			return packetList;
		}

		// 返回结果集
		ResultSet rs = statement.getResultSet();
		ResultSetMetaData meta = rs.getMetaData();
		// result set packet
		PacketResultSet setPacket = new PacketResultSet();
		setPacket.fieldCount = meta.getColumnCount();
		packetList.add(setPacket);

		// field packets
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
			PacketRow rowPacket = new PacketRow("utf8");
			for (int i = 1; i <= meta.getColumnCount(); i++) {
				String value = rs.getString(i);
				rowPacket.addValue(value);
			}
			packetList.add(rowPacket);
		}
		packetList.add(new PacketEof());
		return packetList;
	}
}
