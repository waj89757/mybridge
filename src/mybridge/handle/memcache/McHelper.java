package mybridge.handle.memcache;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mybridge.engine.Field;
import mybridge.protocal.packet.PacketRow;
import net.spy.memcached.MemcachedClient;

public class McHelper {
	public static MemcachedClient getClient() throws IOException {
		return new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
	}

	@SuppressWarnings("unchecked")
	public static PacketRow getRow(List<Field> fieldList, String table, String key, String charset) throws IOException {
		String realKey = "mb_" + table + "_" + key;
		Object value = getClient().get(realKey);
		if (value == null) {
			return null;
		}

		Map<String, String> row = (Map<String, String>) value;
		PacketRow rowPacket = new PacketRow();
		for (Field field : fieldList) {
			if (row.get(field.name) != null) {
				rowPacket.valueList.add(row.get(field.name));
			} else {
				rowPacket.valueList.add("");
			}
		}
		return rowPacket;
	}

	public static void setRow(List<Field> fieldList, String table, String key, Map<String, String> row, int expir, String charset) throws IOException {
		String realKey = "mb_" + table + "_" + key;
		Map<String, String> realRow = new HashMap<String, String>();
		for (Field field : fieldList) {
			if (row.get(field.name) != null) {
				realRow.put(field.name, row.get(field.name));
			}
		}
		getClient().set(realKey, expir, realRow);
	}
}
