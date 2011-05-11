package mybridge.test;

import java.io.File;
import java.io.IOException;

import mybridge.core.table.FieldList;

import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;

public class TestXml {
	public static void main(String[] args) throws IOException, SAXException {
		Digester digester = new Digester();
		digester.setValidating(false);
		digester.addObjectCreate("xml/table", "mybridge.core.table.FieldList");
		digester.addSetProperties("xml/table");

		digester.addObjectCreate("xml/table/field", "mybridge.core.table.Field");
		digester.addSetProperties("xml/table/field");
		digester.addSetNext("xml/table/field", "addField", "mybridge.core.table.Field");

		FieldList fl = (FieldList) digester.parse(new File("./src/table.xml"));

		System.out.println(fl.db);
		System.out.println(fl.getName());
	}
}
