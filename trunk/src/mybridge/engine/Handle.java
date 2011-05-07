package mybridge.engine;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mybridge.protocal.packet.Packet;
import mybridge.protocal.packet.PacketEof;
import mybridge.protocal.packet.PacketField;
import mybridge.protocal.packet.PacketOk;
import mybridge.protocal.packet.PacketResultSet;
import mybridge.protocal.packet.PacketRow;
import mybridge.sql.SqlStatement;

public abstract class Handle {
	public String table;
	public String db;
	public HashMap<String, Field> fieldMap;

	protected Handle(String db, String table) throws SQLException {
		this.table = table;
		this.db = db;
		fieldMap = MysqlHelper.getField(db, table);
	}

	public List<Packet> execute(SqlStatement stat) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();
		if (stat.type == SqlStatement.SELECT) {
			for (String name : stat.fields) {
				if (!fieldMap.containsKey(name)) {
					throw new Exception("invalid col");
				}
			}
			List<HashMap<String, String>> valuesList = select(stat.fields, stat.where, "", "");
			PacketResultSet setPacket = new PacketResultSet();
			setPacket.fieldCount = stat.fields.size();
			packetList.add(setPacket);

			for (String name : stat.fields) {
				Field field = fieldMap.get(name);
				PacketField fieldPacket = new PacketField();
				fieldPacket.db = field.db;
				fieldPacket.table = field.table;
				fieldPacket.orgTable = field.table;
				fieldPacket.name = field.name;
				fieldPacket.orgName = field.name;
				fieldPacket.type = field.type;
				fieldPacket.length = field.length;
				packetList.add(fieldPacket);
			}

			packetList.add(new PacketEof());
			for (HashMap<String, String> row : valuesList) {
				PacketRow rowPacket = new PacketRow();
				for (String name : stat.fields) {
					if (row.containsKey(name)) {
						rowPacket.valueList.add(row.get(name));
					} else {
						Field field = fieldMap.get(name);
						rowPacket.valueList.add(field.defaultVal);
					}
				}
				packetList.add(rowPacket);
			}
			packetList.add(new PacketEof());
		} else if (stat.type == SqlStatement.INSERT) {
			int affectedRows = insert(stat.values);
			PacketOk ok = new PacketOk();
			ok.affectedRows = affectedRows;
			packetList.add(ok);
		} else if (stat.type == SqlStatement.UPDATE) {
			int affectedRows = update(stat.values, stat.where);
			PacketOk ok = new PacketOk();
			ok.affectedRows = affectedRows;
			packetList.add(ok);
		} else if (stat.type == SqlStatement.DELETE) {
			int affectedRows = delete(stat.where);
			PacketOk ok = new PacketOk();
			ok.affectedRows = affectedRows;
			packetList.add(ok);
		} else {
			throw new Exception("invalid sql");
		}
		return packetList;
	}

	/**
	 * select
	 * @param fields
	 * @param where
	 * @param orderCol
	 * @param order
	 * @return
	 * @throws Exception
	 */
	public List<HashMap<String, String>> select(Set<String> fields, HashMap<String, List<String>> where, String orderCol, String order) throws Exception {
		return new ArrayList<HashMap<String, String>>();
	}

	/**
	 * insert
	 * @param values
	 * @return
	 * @throws Exception
	 */
	public int insert(HashMap<String, String> values) throws Exception {
		return 0;
	}

	/**
	 * update
	 * @param values
	 * @param where
	 * @return
	 * @throws Exception
	 */
	public int update(HashMap<String, String> values, HashMap<String, List<String>> where) throws Exception {
		return 0;
	}

	/**
	 * delete
	 * @param where
	 * @return
	 * @throws Exception
	 */
	public int delete(HashMap<String, List<String>> where) throws Exception {
		return 0;
	}
}
