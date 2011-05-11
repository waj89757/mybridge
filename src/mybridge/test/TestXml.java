package mybridge.test;

import java.io.File;
import java.io.IOException;

import mybridge.core.handle.Table;
import mybridge.core.handle.TableSet;

import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;

public class TestXml {
	public static void main(String[] args) throws IOException, SAXException {
		Digester digester = new Digester();
		digester.setValidating(true);
		digester.addObjectCreate("tableset", "mybridge.core.table.TableSet");
		digester.addSetProperties("tableset");

		digester.addObjectCreate("tableset/table", "mybridge.core.table.Table");
		digester.addSetProperties("tableset/table");
		digester.addSetNext("tableset/table", "addTable", "mybridge.core.table.Table");

		digester.addObjectCreate("tableset/table/field", "mybridge.core.table.Field");
		digester.addSetProperties("tableset/table/field");
		digester.addSetNext("tableset/table/field", "addField", "mybridge.core.table.Field");

		TableSet tableSet = (TableSet) digester.parse(new File("./conf/table.xml"));

		System.out.println(111);
	}
}
