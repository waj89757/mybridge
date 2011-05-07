package mybridge.handle.memcache;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;

import net.spy.memcached.MemcachedClient;

import mybridge.engine.Field;
import mybridge.engine.Handle;

/**
 * @author quanwei
 *
 */
public class McHandle extends Handle {
	public McHandle(String db, String table) throws SQLException {
		super(db, table);
	}

	public String pk = "";
	public int expir = 0;

	public List<HashMap<String, String>> select(Set<String> cols, HashMap<String, List<String>> where, String orderCol, String order) throws Exception {
		return select(cols, where);
	}

	public List<HashMap<String, String>> select(Set<String> cols, HashMap<String, List<String>> where) throws Exception {
		if (where.size() != 1) {
			throw new Exception("mc engine only allowed pk select");
		}
		List<String> keys = where.get(pk);
		if (keys == null) {
			throw new Exception("mc engine only allowed select by pk");
		}
		//对keys去重
		Set<String> keysSet = new HashSet<String>();
		for (String key : keys) {
			keysSet.add(key);
		}

		List<HashMap<String, String>> rows = new ArrayList<HashMap<String, String>>();
		MemcachedClient mc = McHelper.getClient();
		for (String key : keysSet) {
			String realKey = "mb_" + table + "_" + key;
			Object value = mc.get(realKey);
			if (value instanceof HashMap) {
				rows.add((HashMap<String, String>) value);
			}
		}
		return rows;
	}

	public int insert(HashMap<String, String> values) throws Exception {
		String key = values.get(pk);
		if (key == null) {
			throw new Exception("mc engine only allowed insert by pk");
		}

		MemcachedClient mc = McHelper.getClient();
		String realKey = "mb_" + table + "_" + key;
		mc.set(realKey, expir, values);
		return 1;
	}

	public int update(HashMap<String, String> values, HashMap<String, List<String>> where) throws Exception {
		Set<String> cols = new HashSet<String>();
		for (String name : fieldMap.keySet()) {
			cols.add(name);
		}

		List<HashMap<String, String>> valuesList = select(cols, where);
		int updateCount = 0;
		for (HashMap<String, String> row : valuesList) {
			for (String key : values.keySet()) {
				row.put(key, values.get(key));
			}
			updateCount += insert(values);
		}
		return updateCount;
	}

	public int delete(HashMap<String, List<String>> where) throws Exception {
		Set<String> cols = new HashSet<String>();
		cols.add(pk);
		List<HashMap<String, String>> valuesList = select(cols, where);
		int updateCount = 0;
		MemcachedClient mc = McHelper.getClient();
		for (HashMap<String, String> row : valuesList) {
			String realKey = "mb_" + table + "_" + row.get(pk);
			mc.delete(realKey);
			updateCount++;
		}
		return updateCount;
	}
}
