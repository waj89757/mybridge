package mybridge.test;

import net.spy.memcached.MemcachedClient;

import mybridge.handle.memcache.McHelper;
import junit.framework.TestCase;

public class TestMemcache extends TestCase {
	public void testSqlParser() throws Exception {
		MemcachedClient mc = McHelper.getClient();
		String key = "test_key";
		mc.set(key, 10, "test value");
		System.out.println(mc.get(key));
	}
}
