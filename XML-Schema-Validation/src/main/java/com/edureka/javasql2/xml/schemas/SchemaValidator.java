package com.edureka.javasql2.xml.schemas;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class SchemaValidator {

	String schemaFilename;
	String xmlFilename;
	
	public SchemaValidator(String schemaFilename, String xmlFilename) {
		
		this.schemaFilename = schemaFilename;
		this.xmlFilename = xmlFilename;
	}
	
	public void validate() throws Exception {
				
		Schema personSchema = getSchema(schemaFilename);
		
		Validator validator = personSchema.newValidator();
	
		File personXmlFile = new File(xmlFilename);		
		StreamSource source = new StreamSource(personXmlFile);
		
		try {
			validator.validate(source);
			System.out.println("Validation Success");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Schema getSchema(String filename) throws SAXException {
		
		SchemaFactory schemaFactory 
		= SchemaFactory.newDefaultInstance();

		File schemaFile = new File(filename);		
		Schema schemaObj = schemaFactory.newSchema(schemaFile);				
		
		return schemaObj;
	}	
}
