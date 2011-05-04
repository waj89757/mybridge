package mybridge.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mybridge.protocal.packet.*;

public class MysqlTool {
	public static List<Packet> query(Connection conn, String sql) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();
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
				rowPacket.valueList.add(new String(rs.getBytes(i), "ASCII"));
			}
			packetList.add(rowPacket);
		}
		packetList.add(new PacketEof());
		return packetList;
	}
}
