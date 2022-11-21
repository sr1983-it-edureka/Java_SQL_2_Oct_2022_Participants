package com.edureka.javasql2.xml.schemas;

public class XMLSchemaValidator {

	public static void main(String[] args) throws Exception {
		
		validate("person.xsd", "person.xml");
		validate("person.xsd", "personv2.xml");		
	}
	
	static void validate(String schemaFilename, String xmlFilename)
		throws Exception{
		
		SchemaValidator validator = new SchemaValidator(
				schemaFilename, xmlFilename);		
		validator.validate();		
	}
}
