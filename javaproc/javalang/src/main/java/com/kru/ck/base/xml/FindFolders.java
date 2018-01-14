package com.kru.ck.base.xml;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class FindFolders {
	
	public static Collection<String> folderNames(String xml, char startingLetter) throws ParserConfigurationException, SAXException, IOException
	{
		if(xml == null || xml.isEmpty())
		{
			return null;
		}
		String first = String.valueOf(startingLetter);

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new ByteArrayInputStream(xml.getBytes()));
		NodeList nList = document.getElementsByTagName("folder");
		if(nList == null || nList.getLength() <= 0)
		{
			return null;
		}

		List<String> folderNames = new ArrayList<String>();
		for(int i=0,len=nList.getLength();i<len;i++)
		{
			Node node = nList.item(i);
			if(node == null || node.getNodeType() != Node.ELEMENT_NODE)
			{
				continue;
			}
			
			Element element = (Element) node;
			if(!element.hasAttribute("name"))
			{
				continue;
			}
			
			String name = element.getAttribute("name");
			//if(name != null && name.charAt(0) == startingLetter)
			if(name != null && name.charAt(0) == startingLetter)
			{
				folderNames.add(name);
			}
		}
		
		return folderNames;
	}
	

	public static void main(String[] args) {
		String xml =
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + 
			"<folder name=\"c\">" +
			"<folder name=\"Program Files\">" +
				"<folder name=\"uninstall information\" />" + 
			"</folder>" + 
			"<folder name=\"users\" />" +
			"<folder name=\"your folder\" />" +
		"</folder>";
		
		try {
			System.out.println(folderNames(xml, 'u'));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
