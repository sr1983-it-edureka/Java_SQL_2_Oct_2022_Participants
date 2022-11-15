package sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SAXReadXMLDemo {

	public static void main(String[] args) {
	
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			SAXParser saxParser = factory.newSAXParser();
			
			File employeesFile = new File("employees.xml");
			
			EmployeeProcessor processor = new EmployeeProcessor();
			try {
				saxParser.parse(employeesFile, processor);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
