package mybridge.core.server;

import mybridge.core.config.MainConfig;

import org.apache.log4j.PropertyConfigurator;
import xnet.core.server.*;

public class MyBridgeServer {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		PropertyConfigurator.configure("./conf/log4j.properties");
		MainConfig.load();

		Config config = new Config();
		config.keepalive = true;
		config.session = MyBridgeSession.class;
		config.threadNum = MainConfig.getServerConfig().getThreadNum();
		config.port = MainConfig.getServerConfig().getPort();
		config.rTimeout = MainConfig.getServerConfig().getReadTimeout();
		config.wTimeout = MainConfig.getServerConfig().getWriteTimeout();
		config.ip = MainConfig.getServerConfig().getIp();
		config.maxConnection = MainConfig.getServerConfig().getMaxConnection();
		Server server = new Server(config);
		server.run();
	}

}
