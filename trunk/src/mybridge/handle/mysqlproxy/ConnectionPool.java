package mybridge.handle.mysqlproxy;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionPool {
	ConnectionPool config;
	List<ComboPooledDataSource> pool = new ArrayList<ComboPooledDataSource>();

	public void addDataSource(ComboPooledDataSource ds) {
		pool.add(ds);
	}

	public Connection getMaster() {
		try {
			if (pool.size() == 0) {
				return null;
			}
			return pool.get(0).getConnection();
		} catch (SQLException e) {
			return null;
		}
	}

	public Connection getSlave() {
		try {
			if (pool.size() == 0) {
				return null;
			}
			if (pool.size() == 1) {
				return pool.get(0).getConnection();
			}
			Random rnd = new Random();
			int index = rnd.nextInt(pool.size() - 1) + 1;
			return pool.get(index).getConnection();
		} catch (SQLException e) {
			return null;
		}
	}
}
