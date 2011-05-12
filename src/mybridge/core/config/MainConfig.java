package mybridge.core.config;

import java.io.File;

import org.apache.commons.digester.Digester;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainConfig {
	static Log logger = LogFactory.getLog(MainConfig.class);

	static ServerConfig serverConfig;
	static TableConfig tableConfig;

	public static ServerConfig getServerConfig() {
		return serverConfig;
	}

	public static TableConfig getTableConfig() {
		return tableConfig;
	}

	static void loadServerConfig() throws Exception {
		Digester digester = new Digester();
		digester.setValidating(false);
		digester.addObjectCreate("mybridge/server", "mybridge.core.config.ServerConfig");
		digester.addSetProperties("mybridge/server");
		serverConfig = (ServerConfig) digester.parse(new File("./conf/server.xml"));
	}

	static void loadTableConfig() throws Exception {
		if (serverConfig == null) {
			throw new Exception("load server confif fail");
		}

		Digester digester = new Digester();
		digester.setValidating(false);
		digester.addObjectCreate("mybridge/tableset", "mybridge.core.config.TableConfig");
		digester.addSetProperties("mybridge/tableset");
		digester.addObjectCreate("mybridge/tableset/table", serverConfig.getTableClass().getName());
		digester.addSetProperties("mybridge/tableset/table");
		digester.addSetNext("mybridge/tableset/table", "addTable", serverConfig.getTableClass().getName());

		digester.addObjectCreate("mybridge/tableset/table/field", serverConfig.getFieldClass().getName());
		digester.addSetProperties("mybridge/tableset/table/field");
		digester.addSetNext("mybridge/tableset/table/field", "addField", serverConfig.getFieldClass().getName());
		tableConfig = (TableConfig) digester.parse(new File("./conf/server.xml"));
	}

	public static void load() throws Exception {
		loadServerConfig();
		loadTableConfig();
		printConfig();
	}

	public static void printConfig() {
		logger.info(serverConfig);
	}
}
