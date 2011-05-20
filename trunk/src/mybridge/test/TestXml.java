package mybridge.test;

import java.io.File;
import java.io.IOException;
 
import mybridge.handle.example.TableConfig;

import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;

public class TestXml {
	public static void main(String[] args) throws IOException, SAXException {
		Digester digester = new Digester();
		digester.setValidating(true);
		digester.addObjectCreate("mybridge/tableset", "mybridge.core.config.TableConfig");
		digester.addSetProperties("mybridge/tableset");

		digester.addObjectCreate("mybridge/tableset/table", "mybridge.core.handle.Table");
		digester.addSetProperties("mybridge/tableset/table");
		digester.addSetNext("mybridge/tableset/table", "addTable", "mybridge.core.handle.Table");

		digester.addObjectCreate("mybridge/tableset/table/field", "mybridge.core.handle.Field");
		digester.addSetProperties("mybridge/tableset/table/field");
		digester.addSetNext("mybridge/tableset/table/field", "addField", "mybridge.core.handle.Field");

		TableConfig tableSet = (TableConfig) digester.parse(new File("./conf/server.xml"));

		System.out.println(tableSet);
	}
}
