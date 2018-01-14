package com.kru.ck.base.xml;

import java.io.File;
import java.io.IOException;

import javax.annotation.Generated;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestSAX {

	public static void main(String[] args) {
		//;
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser;
		try {
			parser = factory.newSAXParser();
			parser.parse(new File("/Users/smanchikal/eclipse-workspace/InterviewPreparation/javaproc/javalang/src/main/resources/employees.xml"), new MySAxHandler());
		} catch (ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
