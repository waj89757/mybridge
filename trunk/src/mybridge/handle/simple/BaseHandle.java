package mybridge.handle.simple;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import mybridge.core.packet.*;
import mybridge.core.server.MyBridgeHandle;
import mybridge.core.util.MysqlServerDef;
import mybridge.handle.simple.sqlparser.*;

public abstract class BaseHandle implements MyBridgeHandle {
	static Log logger = LogFactory.getLog(BaseHandle.class);

	String db = "mybridge";
	String charset = "utf8";

	/**
	 * 获取fieldlist
	 * 
	 * @param colList
	 * @return
	 * @throws Exception
	 */
	protected List<Field> getFieldList(Table table, List<String> colList) throws Exception {
		List<Field> fieldList = new ArrayList<Field>();
		if (colList.size() == 1 && colList.get(0).equals("*")) {
			for (Field field : table.fieldList) {
				fieldList.add(field.clone());
			}
			fieldList = table.fieldList;
		} else {
			for (String name : colList) {
				for (Field field : table.fieldList) {
					if (field.name.equals(name)) {
						fieldList.add(field);
						break;
					}
				}

			}
		}
		if (fieldList.size() == 0) {
			throw new Exception("getFieldIndex error");
		}
		return fieldList;
	}

	List<Packet> packTable(List<String> data) throws Exception {
		if (data.size() == 0) {
			throw new Exception("invalid table data");
		}

		// 第一行为field
		List<Field> fieldList = new ArrayList<Field>();
		String colsStr = data.get(0);
		String[] cols = colsStr.split(",");

		for (int i = 0; i < cols.length; i++) {
			Field f = new Field();
			f.index = i;
			f.length = 256;
			f.type = (byte) 253;// String
			f.name = cols[i];
			fieldList.add(f);
		}
		ResultSet resultSet = new ResultSet();
		for (int i = 1; i < data.size(); i++) {
			resultSet.addNewRow();
			String rowStr = data.get(i);
			String[] row = rowStr.split(",");
			for (int j = 0; j < row.length; j++) {
				resultSet.add(fieldList.get(j), row[j]);
			}
		}
		return packResult(fieldList, resultSet, "", "");
	}

	List<Packet> packCoolationResult() throws Exception {
		return packTable(MysqlServerDef.coolationList);
	}

	List<Packet> packVariableResult() throws Exception {
		return packTable(MysqlServerDef.variableList);
	}

	List<Packet> packResult(List<Field> fieldList, ResultSet resultSet, String db, String table) {
		List<Packet> packetList = new ArrayList<Packet>();
		PacketResultSet setPacket = new PacketResultSet();
		setPacket.fieldCount = fieldList.size();
		packetList.add(setPacket);

		for (Field field : fieldList) {
			PacketField fieldPacket = new PacketField();
			fieldPacket.db = db;
			fieldPacket.table = table;
			fieldPacket.orgTable = table;
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
	 * select
	 * 
	 * @param select
	 * @return
	 * @throws Exception
	 */
	public List<Packet> select(List<Field> fieldList, SelectStatement select) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();

		List<Cond> where = new ArrayList<Cond>();
		if (select.getWhere() != null) {
			where = select.getWhere().getCondList();
		}

		ResultSet resultSet = doSelect(select.getTable(), fieldList, where, select.getOrder(), select.getLimit());
		packetList = packResult(fieldList, resultSet, select.getDb(), select.getTable());
		return packetList;
	}

	/**
	 * insert
	 * 
	 * @param insert
	 * @return
	 * @throws Exception
	 */
	public List<Packet> insert(List<Field> fieldList, InsertStatement insert) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();
		List<Field> insertFieldList = new ArrayList<Field>();
		HashMap<String, String> data = insert.getValues().data;
		for (Field field : fieldList) {
			if (data.containsKey(field.name)) {
				Field insertField = field.clone();
				insertField.value = data.get(insertField.name);
				insertFieldList.add(insertField);
			}
		}
		int affectedRows = doInsert(insert.getTable(), insertFieldList);
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
	public List<Packet> update(List<Field> fieldList, UpdateStatement update) throws Exception {
		List<Packet> packetList = new ArrayList<Packet>();
		List<Field> updateFieldList = new ArrayList<Field>();
		HashMap<String, String> data = update.getValues().data;
		for (Field field : fieldList) {
			if (data.containsKey(field.name)) {
				Field updateField = field.clone();
				updateField.value = data.get(updateField.name);
				updateFieldList.add(updateField);
			}
		}

		List<Cond> where = new ArrayList<Cond>();
		if (update.getWhere() != null) {
			where = update.getWhere().getCondList();
		}

		int affectedRows = doUpdate(update.getTable(), updateFieldList, where);
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

		int affectedRows = doDelete(delete.getTable(), where);
		PacketOk ok = new PacketOk();
		ok.affectedRows = affectedRows;
		packetList.add(ok);
		return packetList;
	}

	public List<Packet> executeCommand(PacketCommand cmd) throws Exception {
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
			logger.debug("sql:[" + sql + "]");
			// 处理mysql cleint库初始化sql
			if (sql.startsWith("SHOW SESSION VARIABLES")) {
				return packVariableResult();
			}
			if (sql.startsWith("SHOW COLLATION")) {
				return packCoolationResult();
			}
			if (sql.startsWith("SET character_set_results = NULL")) {
				packetList.add(new PacketOk());
				setCharset("utf8");
				return packetList;
			}

			// 执行用户sql
			Statement stat = parseSql(sql);
			if (stat instanceof SetNamesStatement) {
				SetNamesStatement setname = (SetNamesStatement) stat;
				setCharset(setname.getCharset());
				packetList.add(new PacketOk());
				return packetList;
			}

			Table table = getTable(db, stat.getTable());
			if (table == null) {
				throw new Exception("table not exists");
			}
			if (stat instanceof SelectStatement) {
				SelectStatement select = (SelectStatement) stat;
				List<Field> fieldList = getFieldList(table, select.getCols());
				packetList = select(fieldList, select);
			} else if (stat instanceof InsertStatement) {
				InsertStatement insert = (InsertStatement) stat;
				List<Field> fieldList = getFieldList(table, insert.getCols());
				packetList = insert(fieldList, insert);
			} else if (stat instanceof UpdateStatement) {
				UpdateStatement update = (UpdateStatement) stat;
				List<Field> fieldList = getFieldList(table, update.getCols());
				packetList = update(fieldList, update);
			} else if (stat instanceof DeleteStatement) {
				DeleteStatement delete = (DeleteStatement) stat;
				packetList = delete(delete);
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

	/**
	 * 查询命令
	 * 
	 * @param fieldList
	 *            需要返回的字段，如select field1,field2
	 * @param where
	 *            过滤条件，如where a=1 and b=2
	 * @param order
	 *            排序规则，如order by a desc
	 * @param limit
	 *            分页，如limit 0,10
	 * @return 返回结果集
	 * @throws Exception
	 */
	public abstract ResultSet doSelect(String table, List<Field> fieldList, List<Cond> where, Order order, Limit limit) throws Exception;

	/**
	 * 插入命令
	 * 
	 * @param fieldList
	 *            待插入记录的字段名值，分别对应<Field.getName,Field.getValue>
	 * @return
	 * @throws Exception
	 */
	public abstract int doInsert(String table, List<Field> fieldList) throws Exception;

	/**
	 * 更新命令
	 * 
	 * @param fieldList
	 *            更新记录的字段名值，分别对应<Field.getName,Field.getValue>
	 * @param where
	 *            过滤条件，如where a=1 and b=2
	 * @return
	 * @throws Exception
	 */
	public abstract int doUpdate(String table, List<Field> fieldList, List<Cond> where) throws Exception;

	/**
	 * 删除命令
	 * 
	 * @param where
	 *            过滤条件，如where a=1 and b=2
	 * @return
	 * @throws Exception
	 */
	public abstract int doDelete(String table, List<Cond> where) throws Exception;

	public abstract Table getTable(String db, String table) throws Exception;

	/**
	 * 初始化，当连接建立时调用
	 */
	public void open() {
	}

	/**
	 * 关闭，quit命令或连接断开时调用
	 */
	public void close() {
	}

	/**
	 * 设置连接编码命令，如set names "utf8"
	 * 
	 * @param charset
	 * @throws Exception
	 */
	public void setCharset(String charset) throws Exception {
		String test = "";
		try {
			test.getBytes(charset);
		} catch (UnsupportedEncodingException e) {
			throw new Exception("invalid charset " + charset);
		}
		this.charset = charset;
	}

	/**
	 * use db命令
	 * 
	 * @param db
	 */
	public void setDb(String db) throws Exception {
		this.db = db;
	}
}
