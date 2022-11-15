package dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMDemoReadXML {

	public static void main(String[] args) throws Exception{
				
		Document resumeXmlDocument = getDocument("shankar-resume.xml");
		
		Element resumeRootElement =resumeXmlDocument.getDocumentElement();
		
		System.out.println(resumeRootElement.getNodeName());
		System.out.println(resumeRootElement.getNodeValue());
		
		
		NodeList projectList = resumeRootElement.getElementsByTagName("project");
		
		int projectsCount = projectList.getLength();
		
		for (int index = 0; index < projectsCount; index ++) {
			
			Node projectNode = projectList.item(index);
			
			System.out.println(projectNode.getNodeName());
			
			if (projectNode.getNodeType() == Node.ELEMENT_NODE) {
				
				Element projectElement = (Element)projectNode;
				
				String id = projectElement.getAttribute("id");
				String teamSize = projectElement.getAttribute("teamSize");
				
				NodeList nameNodeList = projectElement.getElementsByTagName("name");
				Node nameNode = nameNodeList.item(0);				
				String projectName = nameNode.getTextContent();
				
				String duration = projectElement.getElementsByTagName("duration")
						.item(0).getTextContent();

				String client = projectElement.getElementsByTagName("client")
						.item(0).getTextContent();

				String link = projectElement.getElementsByTagName("link")
						.item(0).getTextContent();
				
				
				String employeeDetails = String.format("Id is %s, team Size %s, Project name %s"
						+ ", Duration %s, Client %s, Link %s", id, teamSize, projectName, duration, 
						client, link);
				
				System.out.println(employeeDetails);
//
			}
		}
		
	}
	
	private static Document getDocument(String filename) throws Exception {
		
		DocumentBuilderFactory builderFactory
		= DocumentBuilderFactory.newInstance();
	
		DocumentBuilder builder 
			= builderFactory.newDocumentBuilder();
		
		File resumeFile = new File(filename);
	
		Document resumeXmlDocument = builder.parse(resumeFile);
	
		return resumeXmlDocument;
	}
	
	
}
