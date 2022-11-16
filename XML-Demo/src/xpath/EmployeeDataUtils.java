package xpath;

import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EmployeeDataUtils {

	/*
	 * 1) Construction of expression
	 * 2) Compilation of expression
	 * 3) Evaluation the expression 
	 */
	
	XPath xPath;
	Document employeeXmlDocument;
	
	public EmployeeDataUtils(XPath xPath, Document employeeXmlDocument) {
		this.xPath = xPath;
		this.employeeXmlDocument = employeeXmlDocument;
	}
	
	public String getName(String id) {
		
		
		String firstname = getName(id, "firstName");
		String lastName  = getName(id, "lastName");
		return firstname + "-" + lastName ;
	}

	public ArrayList<String> getNames(String salary){
		
		ArrayList<String> names = new ArrayList<>();
		
		String expression = 
			String.format("/employees/employee[salary >= %s]/firstName/text()", salary);
		
		XPathExpression xPathExpressionObj;
		try {
			xPathExpressionObj = xPath.compile(expression);
			
			NodeList firstNamesNodeList 
			= (NodeList)xPathExpressionObj.evaluate(employeeXmlDocument, XPathConstants.NODESET);
		
		for (int index = 0; index < firstNamesNodeList.getLength(); index ++) {
			
			Node firstNameNode = firstNamesNodeList.item(index);
			
			String firstName = firstNameNode.getNodeValue();
			names.add(firstName);
		}
			
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return names;
	}
	
	public String getName(String id, String elementName) {
		
		
		String expression = 
			String.format("/employees/employee[@id=%s]/%s/text()", 
					id, elementName);
		
		XPathExpression xPathExpressionObj;
		try {
			xPathExpressionObj = xPath.compile(expression);
			
			String firstName = (String)xPathExpressionObj.evaluate(
					employeeXmlDocument, XPathConstants.STRING);
			
			return firstName;
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}
}
