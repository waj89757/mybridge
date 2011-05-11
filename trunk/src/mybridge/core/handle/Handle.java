package mybridge.core.handle;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import mybridge.core.packet.Packet;
import mybridge.core.packet.PacketCommand;
import mybridge.core.packet.PacketEof;
import mybridge.core.packet.PacketError;
import mybridge.core.packet.PacketField;
import mybridge.core.packet.PacketOk;
import mybridge.core.packet.PacketResultSet;
import mybridge.core.packet.PacketRow;
import mybridge.core.sqlparser.Cond;
import mybridge.core.sqlparser.DeleteStatement;
import mybridge.core.sqlparser.InsertStatement;
import mybridge.core.sqlparser.Limit;
import mybridge.core.sqlparser.Order;
import mybridge.core.sqlparser.SelectStatement;
import mybridge.core.sqlparser.SetNamesStatement;
import mybridge.core.sqlparser.SqlLexer;
import mybridge.core.sqlparser.SqlParser;
import mybridge.core.sqlparser.Statement;
import mybridge.core.sqlparser.UpdateStatement;

public abstract class Handle {
	static Log logger = LogFactory.getLog(Handle.class);
	protected Table table;
	String db = "mybridge";
	String charset = "utf8";

	/**
	 * 获取field的索引
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	protected Field getField(String name) throws Exception {
		for (int i = 0; i < table.fieldList.size(); i++) {
			if (table.fieldList.get(i).name.equals(name)) {
				return table.fieldList.get(i).clone();
			}
		}
		throw new Exception("getFieldIndex error");
	}

	/**
	 * 获取fieldlist
	 * 
	 * @param colList
	 * @return
	 * @throws Exception
	 */
	protected List<Field> getFieldList(List<String> colList) throws Exception {
		List<Field> fieldList = new ArrayList<Field>();
		if (colList.size() == 1 && colList.get(0).equals("*")) {
			for (Field field : table.fieldList) {
				fieldList.add(field.clone());
			}
			fieldList = table.fieldList;
		} else {
			for (String name : colList) {
				fieldList.add(getField(name));
			}
		}
		if (fieldList.size() == 0) {
			throw new Exception("getFieldIndex error");
		}
		return fieldList;
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

		List<Field> fieldList = getFieldList(select.getColList().cols);

		List<Cond> where = new ArrayList<Cond>();
		if (select.getWhere() != null) {
			where = select.getWhere().getCondList();
		}

		ResultSet resultSet = doSelect(fieldList, where, select.getOrder(), select.getLimit());

		PacketResultSet setPacket = new PacketResultSet();
		setPacket.fieldCount = fieldList.size();
		packetList.add(setPacket);

		for (Field field : fieldList) {
			PacketField fieldPacket = new PacketField();
			fieldPacket.db = "mybridge";
			fieldPacket.table = select.getTable();
			fieldPacket.orgTable = select.getTable();
			fieldPacket.name = field.name;
			fieldPacket.orgName = field.name;
			fieldPacket.type = field.type;
			fieldPacket.length = field.length;
			packetList.add(fieldPacket);
		}
		packetList.add(new PacketEof());

		for (HashMap<String, String> row : resultSet.data) {
			PacketRow rowPacket = new PacketRow(charset);
			for (Field field : fieldList) {
				if (row.containsKey(field.getName())) {
					rowPacket.addValue(row.get(field.getName()));
				} else {
					rowPacket.addValue(field.getValue());
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
		List<Field> fieldList = getFieldList(insert.getColList().cols);
		HashMap<String, String> data = insert.getValues().data;
		for (Field field : fieldList) {
			field.value = data.get(field.name);
		}
		int affectedRows = doInsert(fieldList);
		PacketOk ok = new PacketOk();
		ok.affectedRows = affectedRows;
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
		HashMap<String, String> data = update.getValues().data;
		List<Field> fieldList = new ArrayList<Field>();
		for (String name : data.keySet()) {
			Field field = getField(name);
			field.value = data.get(name);
			fieldList.add(field);
		}

		List<Cond> where = new ArrayList<Cond>();
		if (update.getWhere() != null) {
			where = update.getWhere().getCondList();
		}

		int affectedRows = doUpdate(fieldList, where);
		PacketOk ok = new PacketOk();
		ok.affectedRows = affectedRows;
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
		List<Cond> where = new ArrayList<Cond>();
		if (delete.getWhere() != null) {
			where = delete.getWhere().getCondList();
		}

		int affectedRows = doDelete(where);
		PacketOk ok = new PacketOk();
		ok.affectedRows = affectedRows;
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
	public abstract ResultSet doSelect(List<Field> fieldList, List<Cond> where,
			Order order, Limit limit) throws Exception;

	/**
	 * 执行insert
	 * 
	 * @param colList
	 * @param values
	 * @return
	 * @throws Exception
	 */
	public abstract int doInsert(List<Field> fieldList) throws Exception;

	/**
	 * 执行update
	 * 
	 * @param values
	 * @param where
	 * @return
	 * @throws Exception
	 */
	public abstract int doUpdate(List<Field> fieldList, List<Cond> where)
			throws Exception;

	/**
	 * 执行delete
	 * 
	 * @param where
	 * @return
	 * @throws Exception
	 */
	public abstract int doDelete(List<Cond> where) throws Exception;

	/**
	 * open
	 */
	public void open() {
	}

	/**
	 * close
	 */
	public void close() {
	}

	public void setCharset(String charset) throws Exception {
		String test = "";
		try {
			test.getBytes(charset);
		} catch (UnsupportedEncodingException e) {
			throw new Exception("invalid charset " + charset);
		}
		this.charset = charset;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public List<Packet> executeCommand(PacketCommand cmd) {
		List<Packet> packetList = new ArrayList<Packet>();

		if (cmd.type != 3) {
			if (cmd.type == 0x1) {
				return null;
			}
			PacketOk ok = new PacketOk();
			ok.affectedRows = 0;
			packetList.add(ok);
			return packetList;
		}

		try {
			String sql = new String(cmd.value, charset);
			logger.info("sql:[" + sql + "]");
			Statement stat = parseSql(sql);
			if (stat instanceof SetNamesStatement) {
				SetNamesStatement setname = (SetNamesStatement) stat;
				setCharset(setname.getCharset());
				packetList.add(new PacketOk());
				return packetList;
			}

			table = TableManeger.getTable(db, stat.getTable());
			if (table == null) {
				throw new Exception("table not exists");
			}
			if (stat instanceof SelectStatement) {
				packetList = select((SelectStatement) stat);
			} else if (stat instanceof InsertStatement) {
				packetList = insert((InsertStatement) stat);
			} else if (stat instanceof UpdateStatement) {
				packetList = update((UpdateStatement) stat);
			} else if (stat instanceof DeleteStatement) {
				packetList = delete((DeleteStatement) stat);
			} else {
				PacketError error = new PacketError();
				error.message = "invalid statment";
				packetList.add(error);
			}
		} catch (Exception e) {
			PacketError error = new PacketError();
			if (e.getMessage() != null) {
				error.message = e.getMessage();
			}
			packetList.add(error);
		}

		return packetList;
	}

	Statement parseSql(String sql) throws Exception {
		SqlLexer lex = new SqlLexer(new ANTLRStringStream(sql));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		SqlParser parser = new SqlParser(tokens);
		try {
			parser.parse();
		} catch (RecognitionException e) {
			throw new Exception("sql syntex error(" + parser.errorMsg + ")");
		}
		return parser.getStatement();
	}
}
