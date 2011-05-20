package mybridge.handle.mysqlproxy;

import mybridge.core.server.MyBridgeServer;

public class Server {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//加载配置
		ConnectionPool.init();
		//初始化服务
		MyBridgeServer server = new MyBridgeServer();
		//设置HandleClass
		server.setHandleClass(Handle.class);
		//启动服务
		server.run();
	}
}
