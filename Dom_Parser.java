
package xml_parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.xml.sax.SAXException;



public class Dom_Parser {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
	DocumentBuilder db=dbf.newDocumentBuilder();
	
	Document d1 =  db.parse(new File("C:/New folder/data.xml"));
	
	List <Employee> emp = new ArrayList<Employee>();
	
	NodeList nl = d1.getDocumentElement().getChildNodes();
	
	for(int i=0;i<nl.getLength();i++)
	{
		Node node = nl.item(i);
		
		if(node.getNodeType()==Node.ELEMENT_NODE)
		{
			Element element=(Element) node;
			String ID=node.getAttributes().getNamedItem("ID").getNodeValue();
			
			String firstName= element.getElementsByTagName("firstName").item(0).getChildNodes().item(0).getNodeValue();
			
			String lastName=element.getElementsByTagName("lastName").item(0).getChildNodes().item(0).getNodeValue();
			
			Integer age= Integer.parseInt(element.getElementsByTagName("Age").item(0).getChildNodes().item(0).getNodeValue());
			
			Double salary=Double.parseDouble(element.getElementsByTagName("salary").item(0).getChildNodes().item(0).getNodeValue());
			
			emp.add(new Employee(ID,firstName,lastName,age,salary));
		}
	}
}
}