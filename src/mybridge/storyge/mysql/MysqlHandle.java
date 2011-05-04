package mybridge.storyge.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import mybridge.protocal.impl.Protocal;
import mybridge.protocal.packet.*;
import mybridge.storyge.Handle;
import mybridge.util.MysqlDefs;
import mybridge.util.MysqlTool;

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
		return MysqlTool.query(conn, sql);
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

	@Override
	public void init() {
	}

}
