package xpath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XPathDemo {

	public static void main(String[] args) {
		
		XPath path = getXPath();
		Document employeeDocument = getDocument("employees.xml");
		EmployeeDataUtils employeeUtils = new EmployeeDataUtils(
				path, employeeDocument);
		
		String name = employeeUtils.getName("103");
		System.out.println("Name is " + name);
		
		ArrayList<String> names = employeeUtils.getNames("145000");
		System.out.println("Names " + names);
	}
	
	static XPath getXPath() {
		
		XPathFactory factory = XPathFactory.newInstance();
		
		XPath xPath = factory.newXPath();
		
		return xPath;
	}
	
	static Document getDocument(String filename) {
		
		DocumentBuilderFactory builderFactory
		= DocumentBuilderFactory.newInstance();
	
		DocumentBuilder builder;
		try {
			builder = builderFactory.newDocumentBuilder();
			
			File resumeFile = new File(filename);
			
			Document resumeXmlDocument = builder.parse(resumeFile);
		
			return resumeXmlDocument;
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();			
		}catch (SAXException e) {
			e.printStackTrace();
		}
		return null;		
	}
}
