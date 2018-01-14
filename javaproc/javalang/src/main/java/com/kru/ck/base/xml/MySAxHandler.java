package com.kru.ck.base.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySAxHandler extends DefaultHandler {

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if("employee".equals(qName))
		{
			System.out.println(attributes.getValue("type"));
		}
	}
}
