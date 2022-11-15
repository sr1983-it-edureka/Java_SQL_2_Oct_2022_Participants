package sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmployeeProcessor extends DefaultHandler{

	boolean firstNameVisited;
	boolean lastNameVisited;
	boolean ageVisited;
	boolean locationVisited;
	
    public void startDocument ()
            throws SAXException{
    	
//    	System.out.println("Start Document");
    }

    public void startElement (String uri, String localName,
                              String qName, Attributes attributes)
        throws SAXException
    {
//    	System.out.println("Start Element -> " + qName);
    	
    	if (qName.equals("firstName")) {
    		
    		firstNameVisited = true;
    		
    	}else if (qName.equals("lastName")) {
    		
    		lastNameVisited = true;
    		
    	}else if (qName.equals("age")) {
    		
    		ageVisited = true;
    	}else if (qName.equals("location")) {
    		
    		locationVisited = true;
    	}
    	
    	int attributesCount = attributes.getLength();
    	
    	StringBuilder contents = new StringBuilder();
    	
    	for (int index = 0; index < attributesCount; index ++) {
    		
    		String attributeName = attributes.getLocalName(index);
    		String attributeValue = attributes.getValue(index);
    		
//    		contents.append(
//    			String.format("Attr Name is %s, Value is %s, ", attributeName, attributeValue));
//    		contents.append(System.getProperty("line.separator"));
    	}
    	
//    	System.out.println(contents.toString());
        // no op
    }
    
    
    @Override
    public void characters (char ch[], int start, int length)
        throws SAXException
    {
    	String str = new String(ch, start, length);
    	
    	if (firstNameVisited) {
    		System.out.println("First Name ->" + str);
    		firstNameVisited = false;
    	}
    	
    	if (lastNameVisited == true) {
    		
    		System.out.println("Last Name ->" + str);
    		lastNameVisited = false;
    	}
    	
    	if (ageVisited == true) {
    		
    		System.out.println("Age ->" + str);
    		ageVisited = false;
    	}
    	
    	if (locationVisited) {
    		
    		System.out.println("Location ->" + str);
    		locationVisited = false;
    	}
        // no op
    }

    
    public void endElement (String uri, String localName,
            String qName)
            	throws SAXException{
//    	System.out.println("End Element -> " + qName);    	
    }
    
    

    public void endDocument()
            throws SAXException{
    	
//    	System.out.println("End Document");
    }

}
