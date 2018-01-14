package com.kru.ck.base.xml;

import java.io.File;
import java.io.IOException;

import javax.annotation.Generated;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestDOM {

	public static void main(String[] args) {
		Document doc = getDocument("/Users/smanchikal/eclipse-workspace/InterviewPreparation/javaproc/javalang/src/main/resources/employees.xml");
		processELementsByTag(doc);
	}
	
	
	private static void processELementsByTag(Document doc)
	{
		NodeList empList = doc.getElementsByTagName("employee");
		System.out.println("emplyees count : " + empList.getLength());
		if(empList != null && empList.getLength() > 0)
		{
			for(int i =0, len=empList.getLength();i<len;i++)
			{
				Node node = empList.item(i);
				if(node != null && node.getNodeType() == Node.ELEMENT_NODE)
				{
					NodeList eChildren = node.getChildNodes();
					System.out.println("emplyee children count : " + eChildren.getLength());
					for(int j =0, len1=eChildren.getLength();j<len1;j++)
					{
						System.out.println(eChildren.item(j).getNodeName());
					}
				}
			}
		}
	}
	
	private static Document getDocument(String fileName)
	{
		Document doc = null; 
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(new File(fileName));
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		
		return doc;
	}

}
