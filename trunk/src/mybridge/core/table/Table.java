package mybridge.core.table;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mybridge.core.packet.Packet;
import mybridge.core.packet.PacketEof;
import mybridge.core.packet.PacketField;
import mybridge.core.packet.PacketOk;
import mybridge.core.packet.PacketResultSet;
import mybridge.core.packet.PacketRow;
import mybridge.core.sqlparser.ColList;
import mybridge.core.sqlparser.DeleteStatement;
import mybridge.core.sqlparser.InsertStatement;
import mybridge.core.sqlparser.Limit;
import mybridge.core.sqlparser.Order;
import mybridge.core.sqlparser.SelectStatement;
import mybridge.core.sqlparser.UpdateStatement;
import mybridge.core.sqlparser.Values;
import mybridge.core.sqlparser.Where;

public abstract class Table {
	public String db;
	public String name;
	public List<Field> fieldList;

	/**
	 * 构造函数
	 * 
	 * @param db
	 * @param table
	 * @throws SQLException
	 */
	protected Table(String db, String table) {
		this.db = db;
		this.name = table;
	}

	/**
	 * 获取field的索引
	 * @param name
	 * @return
	 * @throws Exception
	 */
	protected int getFieldIndex(String name) throws Exception {
		for (int i = 0; i < fieldList.size(); i++) {
			if (fieldList.get(i).name.equals(name)) {
				return i;
			}
		}
		throw new Exception("getFieldIndex error");
	}

	/**
	 * 创建新行
	 * 
	 * @return
	 */
	protected Row createNewRow() {
		return new Row(this);
	}

	/**
	 * select
	 * 
	 * @param select
	 * @return
	 * @throws Exception
	 */
	public List<Packet> select(SelectStatement select) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();

		List<String> colList = select.getColList().cols;
		List<Integer> indexs = new ArrayList<Integer>();
		for (String name : colList) {
			indexs.add(getFieldIndex(name));
		}

		List<Row> rowList = doSelect(select.getColList(), select.getWhere(), select.getOrder(), select.getLimit());

		PacketResultSet setPacket = new PacketResultSet();
		setPacket.fieldCount = colList.size();
		packetList.add(setPacket);

		for (int i : indexs) {
			Field field = fieldList.get(i);
			PacketField fieldPacket = new PacketField();
			fieldPacket.db = db;
			fieldPacket.table = name;
			fieldPacket.orgTable = name;
			fieldPacket.name = field.name;
			fieldPacket.orgName = field.name;
			fieldPacket.type = field.type;
			fieldPacket.length = field.length;
			packetList.add(fieldPacket);
		}
		packetList.add(new PacketEof());

		for (Row row : rowList) {
			PacketRow rowPacket = new PacketRow();
			for (int i : indexs) {
				if (row.data.length > i) {
					rowPacket.valueList.add(row.data[i]);
				} else {
					throw new Exception("rows index overflow");
				}
			}
			packetList.add(rowPacket);
		}
		packetList.add(new PacketEof());

		return packetList;
	}

	/**
	 * insert
	 * 
	 * @param insert
	 * @return
	 * @throws Exception
	 */
	public List<Packet> insert(InsertStatement insert) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();
		PacketOk ok = new PacketOk();
		ok.affectedRows = doInsert(insert.getColList(), insert.getValues());
		packetList.add(ok);
		return packetList;
	}

	/**
	 * update
	 * 
	 * @param update
	 * @return
	 * @throws Exception
	 */
	public List<Packet> update(UpdateStatement update) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();
		PacketOk ok = new PacketOk();
		ok.affectedRows = doUpdate(update.getValues(), update.getWhere());
		packetList.add(ok);
		return packetList;
	}

	/**
	 * delete
	 * 
	 * @param delete
	 * @return
	 * @throws Exception
	 */
	public List<Packet> delete(DeleteStatement delete) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();
		PacketOk ok = new PacketOk();
		ok.affectedRows = doDelete(delete.getWhere());
		packetList.add(ok);
		return packetList;
	}

	/**
	 * 执行select
	 * 
	 * @param colList
	 * @param where
	 * @param order
	 * @param limit
	 * @return
	 * @throws Exception
	 */
	public abstract List<Row> doSelect(ColList colList, Where where,
			Order order, Limit limit) throws Exception;

	/**
	 * 执行insert
	 * 
	 * @param colList
	 * @param values
	 * @return
	 * @throws Exception
	 */
	public abstract int doInsert(ColList colList, Values values)
			throws Exception;

	/**
	 * 执行update
	 * 
	 * @param values
	 * @param where
	 * @return
	 * @throws Exception
	 */
	public abstract int doUpdate(Values values, Where where) throws Exception;

	/**
	 * 执行delete
	 * 
	 * @param where
	 * @return
	 * @throws Exception
	 */
	public abstract int doDelete(Where where) throws Exception;
}
