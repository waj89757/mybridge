/*
 Copyright (C) 2002-2004 MySQL AB

 This program is free software; you can redistribute it and/or modify
 it under the terms of version 2 of the GNU General Public License as 
 published by the Free Software Foundation.

 There are special exceptions to the terms and conditions of the GPL 
 as it is applied to this software. View the full text of the 
 exception in file EXCEPTIONS-CONNECTOR-J in the directory of this 
 software distribution.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA



 */
package mybridge.util;

import java.sql.Types;

/**
 * MysqlDefs contains many values that are needed for communication with the
 * MySQL server.
 * 
 * @author Mark Matthews
 * @version $Id: MysqlDefs.java 4724 2005-12-20 23:27:01Z mmatthews $
 */
public final class MysqlDefs {
	// ~ Static fields/initializers
	// ---------------------------------------------

	public static final int COM_QUIT = 1;
	public static final int COM_INIT_DB = 2;

	public static final int COM_BINLOG_DUMP = 18;

	public static final int COM_CHANGE_USER = 17;

	public static final int COM_CLOSE_STATEMENT = 25;

	public static final int COM_CONNECT_OUT = 20;

	public static final int COM_END = 29;

	public static final int COM_EXECUTE = 23;

	public static final int COM_FETCH = 28;

	public static final int COM_LONG_DATA = 24;

	public static final int COM_PREPARE = 22;

	public static final int COM_REGISTER_SLAVE = 21;

	public static final int COM_RESET_STMT = 26;

	public static final int COM_SET_OPTION = 27;

	public static final int COM_TABLE_DUMP = 19;

	public static final int CONNECT = 11;

	public static final int CREATE_DB = 5;

	public static final int DEBUG = 13;

	public static final int DELAYED_INSERT = 16;

	public static final int DROP_DB = 6;

	public static final int FIELD_LIST = 4;

	public static final int FIELD_TYPE_BIT = 16;

	public static final int FIELD_TYPE_BLOB = 252;

	public static final int FIELD_TYPE_DATE = 10;

	public static final int FIELD_TYPE_DATETIME = 12;

	// Data Types
	public static final int FIELD_TYPE_DECIMAL = 0;

	public static final int FIELD_TYPE_DOUBLE = 5;

	public static final int FIELD_TYPE_ENUM = 247;

	public static final int FIELD_TYPE_FLOAT = 4;

	public static final int FIELD_TYPE_GEOMETRY = 255;

	public static final int FIELD_TYPE_INT24 = 9;

	public static final int FIELD_TYPE_LONG = 3;

	public static final int FIELD_TYPE_LONG_BLOB = 251;

	public static final int FIELD_TYPE_LONGLONG = 8;

	public static final int FIELD_TYPE_MEDIUM_BLOB = 250;

	public static final int FIELD_TYPE_NEW_DECIMAL = 246;

	public static final int FIELD_TYPE_NEWDATE = 14;

	public static final int FIELD_TYPE_NULL = 6;

	public static final int FIELD_TYPE_SET = 248;

	public static final int FIELD_TYPE_SHORT = 2;

	public static final int FIELD_TYPE_STRING = 254;

	public static final int FIELD_TYPE_TIME = 11;

	public static final int FIELD_TYPE_TIMESTAMP = 7;

	public static final int FIELD_TYPE_TINY = 1;

	// Older data types
	public static final int FIELD_TYPE_TINY_BLOB = 249;

	public static final int FIELD_TYPE_VAR_STRING = 253;

	public static final int FIELD_TYPE_VARCHAR = 15;

	// Newer data types
	public static final int FIELD_TYPE_YEAR = 13;

	public static final int INIT_DB = 2;

	public static final long LENGTH_BLOB = 65535;

	public static final long LENGTH_LONGBLOB = 4294967295L;

	public static final long LENGTH_MEDIUMBLOB = 16777215;

	public static final long LENGTH_TINYBLOB = 255;

	// Limitations
	public static final int MAX_ROWS = 50000000; // From the MySQL FAQ

	/**
	 * Used to indicate that the server sent no field-level character set
	 * information, so the driver should use the connection-level character
	 * encoding instead.
	 */
	public static final int NO_CHARSET_INFO = -1;

	public static final byte OPEN_CURSOR_FLAG = 1;

	public static final int PING = 14;

	public static final int PROCESS_INFO = 10;

	public static final int PROCESS_KILL = 12;

	public static final int QUERY = 3;

	public static final int QUIT = 1;

	// ~ Methods
	// ----------------------------------------------------------------

	public static final int RELOAD = 7;

	public static final int SHUTDOWN = 8;

	//
	// Constants defined from mysql
	//
	// DB Operations
	public static final int SLEEP = 0;

	public static final int STATISTICS = 9;

	public static final int TIME = 15;

	public static int javaTypeToMysql(int javaType) {
		int mysqlType;
		switch (javaType) {
		case Types.DECIMAL:
			mysqlType = MysqlDefs.FIELD_TYPE_DECIMAL;
			break;
		case Types.SMALLINT:
			mysqlType = MysqlDefs.FIELD_TYPE_SHORT;
			break;
		case Types.TINYINT:
			mysqlType = MysqlDefs.FIELD_TYPE_TINY;
			break;
		case Types.INTEGER:
			mysqlType = MysqlDefs.FIELD_TYPE_LONG;
			break;
		case Types.REAL:
			mysqlType = MysqlDefs.FIELD_TYPE_FLOAT;
			break;
		case Types.DOUBLE:
			mysqlType = MysqlDefs.FIELD_TYPE_DOUBLE;
			break;
		case Types.NULL:
			mysqlType = MysqlDefs.FIELD_TYPE_NULL;
			break;
		case Types.TIMESTAMP:
			mysqlType = MysqlDefs.FIELD_TYPE_TIMESTAMP;
			break;
		case Types.BIGINT:
			mysqlType = MysqlDefs.FIELD_TYPE_LONGLONG;
			break;
		case Types.DATE:
			mysqlType = MysqlDefs.FIELD_TYPE_NEWDATE;
			break;
		case Types.TIME:
			mysqlType = MysqlDefs.FIELD_TYPE_TIME;
			break;
		case Types.CHAR:
			mysqlType = MysqlDefs.FIELD_TYPE_STRING;
			break;
		case Types.LONGVARBINARY:
			mysqlType = MysqlDefs.FIELD_TYPE_BLOB;
			break;
		case Types.VARCHAR:
			mysqlType = MysqlDefs.FIELD_TYPE_VARCHAR;
			break;
		case Types.BINARY:
			mysqlType = MysqlDefs.FIELD_TYPE_GEOMETRY;
			break;
		case Types.BIT:
			mysqlType = MysqlDefs.FIELD_TYPE_BIT;
			break;
		default:
			mysqlType = MysqlDefs.FIELD_TYPE_VARCHAR;
		}
		return mysqlType;
	}

	/**
	 * Maps the given MySQL type to the correct JDBC type.
	 */
	static int mysqlToJavaType(int mysqlType) {
		int jdbcType;

		switch (mysqlType) {
		case MysqlDefs.FIELD_TYPE_NEW_DECIMAL:
		case MysqlDefs.FIELD_TYPE_DECIMAL:
			jdbcType = Types.DECIMAL;

			break;

		case MysqlDefs.FIELD_TYPE_TINY:
			jdbcType = Types.TINYINT;

			break;

		case MysqlDefs.FIELD_TYPE_SHORT:
			jdbcType = Types.SMALLINT;

			break;

		case MysqlDefs.FIELD_TYPE_LONG:
			jdbcType = Types.INTEGER;

			break;

		case MysqlDefs.FIELD_TYPE_FLOAT:
			jdbcType = Types.REAL;

			break;

		case MysqlDefs.FIELD_TYPE_DOUBLE:
			jdbcType = Types.DOUBLE;

			break;

		case MysqlDefs.FIELD_TYPE_NULL:
			jdbcType = Types.NULL;

			break;

		case MysqlDefs.FIELD_TYPE_TIMESTAMP:
			jdbcType = Types.TIMESTAMP;

			break;

		case MysqlDefs.FIELD_TYPE_LONGLONG:
			jdbcType = Types.BIGINT;

			break;

		case MysqlDefs.FIELD_TYPE_INT24:
			jdbcType = Types.INTEGER;

			break;

		case MysqlDefs.FIELD_TYPE_DATE:
			jdbcType = Types.DATE;

			break;

		case MysqlDefs.FIELD_TYPE_TIME:
			jdbcType = Types.TIME;

			break;

		case MysqlDefs.FIELD_TYPE_DATETIME:
			jdbcType = Types.TIMESTAMP;

			break;

		case MysqlDefs.FIELD_TYPE_YEAR:
			jdbcType = Types.DATE;

			break;

		case MysqlDefs.FIELD_TYPE_NEWDATE:
			jdbcType = Types.DATE;

			break;

		case MysqlDefs.FIELD_TYPE_ENUM:
			jdbcType = Types.CHAR;

			break;

		case MysqlDefs.FIELD_TYPE_SET:
			jdbcType = Types.CHAR;

			break;

		case MysqlDefs.FIELD_TYPE_TINY_BLOB:
			jdbcType = Types.VARBINARY;

			break;

		case MysqlDefs.FIELD_TYPE_MEDIUM_BLOB:
			jdbcType = Types.LONGVARBINARY;

			break;

		case MysqlDefs.FIELD_TYPE_LONG_BLOB:
			jdbcType = Types.LONGVARBINARY;

			break;

		case MysqlDefs.FIELD_TYPE_BLOB:
			jdbcType = Types.LONGVARBINARY;

			break;

		case MysqlDefs.FIELD_TYPE_VAR_STRING:
		case MysqlDefs.FIELD_TYPE_VARCHAR:
			jdbcType = Types.VARCHAR;

			break;

		case MysqlDefs.FIELD_TYPE_STRING:
			jdbcType = Types.CHAR;

			break;
		case MysqlDefs.FIELD_TYPE_GEOMETRY:
			jdbcType = Types.BINARY;

			break;
		case MysqlDefs.FIELD_TYPE_BIT:
			jdbcType = Types.BIT;

			break;
		default:
			jdbcType = Types.VARCHAR;
		}

		return jdbcType;
	}
}
