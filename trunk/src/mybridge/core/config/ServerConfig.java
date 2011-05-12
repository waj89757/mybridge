package mybridge.core.config;

import mybridge.core.handle.Field;
import mybridge.core.handle.Handle;
import mybridge.core.handle.Table;
import mybridge.handle.example.ExampleHandle;

public class ServerConfig {
	public String ip = "0.0.0.0";
	public int port = 10000;
	public int threadNum = Runtime.getRuntime().availableProcessors() + 1;
	public int maxConnection = 1000;
	public int readTimeout = 0;
	public int writeTimeout = 0;
	Class<?> tableClass = Table.class;
	Class<?> fieldClass = Field.class;
	Class<?> handleClass = ExampleHandle.class;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getThreadNum() {
		return threadNum;
	}

	public void setThreadNum(int threadNum) {
		this.threadNum = threadNum;
	}

	public int getMaxConnection() {
		return maxConnection;
	}

	public void setMaxConnection(int maxConnection) {
		this.maxConnection = maxConnection;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

	public int getWriteTimeout() {
		return writeTimeout;
	}

	public void setWriteTimeout(int writeTimeout) {
		this.writeTimeout = writeTimeout;
	}

	public Class<?> getTableClass() {
		return tableClass;
	}

	public void setTableClass(String className) throws Exception {
		Class<?> cls = Class.forName(className);
		if (cls == null) {
			throw new Exception("load handle class error");
		}
		if (!cls.isAssignableFrom(Table.class)) {
			throw new Exception("handle class is not a subclass of mybridge.core.Handle");
		}
		tableClass = cls;
	}

	public Class<?> getFieldClass() {
		return fieldClass;
	}

	public void setFieldClass(String className) throws Exception {
		Class<?> cls = Class.forName(className);
		if (cls == null) {
			throw new Exception("load handle class error");
		}
		if (!cls.isAssignableFrom(Field.class)) {
			throw new Exception("handle class is not a subclass of mybridge.core.Handle");
		}
		fieldClass = cls;
	}

	public Class<?> getHandleClass() {
		return handleClass;
	}

	public void setHandleClass(String className) throws Exception {
		Class<?> cls = Class.forName(className);
		if (cls == null) {
			throw new Exception("load handle class error");
		}
		if (!cls.isAssignableFrom(Handle.class)) {
			throw new Exception("handle class is not a subclass of mybridge.core.Handle");
		}
		handleClass = cls;
	}

	public Handle getHandle() throws InstantiationException,
			IllegalAccessException {
		return (Handle) this.handleClass.newInstance();
	}
	
	public String toString() {
		String info = "";
		info += String.format("\nip=%s\n", ip);
		info += String.format("port=%s\n", port);
		info += String.format("threadNum=%s\n", threadNum);
		info += String.format("maxConnection=%s\n", maxConnection);
		info += String.format("readTimeout=%s\n", readTimeout);
		info += String.format("writeTimeout=%s\n", writeTimeout);
		info += String.format("handleClass=%s\n", handleClass.getName());
		info += String.format("tableClass=%s\n", tableClass.getName());
		info += String.format("fieldClass=%s\n", fieldClass.getName());
		return info;
	}
}
