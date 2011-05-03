package mybridge.storyge.mysql;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

import mybridge.protocal.packet.Packet;
import mybridge.protocal.packet.PacketCommand;
import mybridge.protocal.packet.PacketEof;
import mybridge.protocal.packet.PacketField;
import mybridge.protocal.packet.PacketResultSet;
import mybridge.protocal.packet.PacketRow;
import mybridge.storyge.Handle;

public class MysqlHandle implements Handle {
	public List<Packet> doCommand(PacketCommand cmd) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();

		if (cmd.type != 3) {
			packetList.add(new PacketEof());
			return packetList;
		}

		//执行sql
		ResultSet rs = query(cmd.value);
		ResultSetMetaData meta = (ResultSetMetaData) rs.getMetaData();

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
				rowPacket.valueList.add(rs.getString(i));
			}
			packetList.add(rowPacket);
		}
		packetList.add(new PacketEof());
		return packetList;
	}

	ResultSet query(String sql) throws Exception {
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
		Connection conn = (Connection) DriverManager.getConnection(url, user, password);
		if (!conn.isClosed()) {
			System.out.println("Succeeded connecting to the Database!");
		}
		// statement用来执行SQL语句
		Statement statement = (Statement) conn.createStatement();
		// 结果集
		ResultSet rs = (ResultSet) statement.executeQuery(sql);
		return rs;

	}

}
