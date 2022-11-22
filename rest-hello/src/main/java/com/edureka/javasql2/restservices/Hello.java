package com.edureka.javasql2.restservices;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

//	@GET
	public String sayHello() {

		return "hello";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String listProducts() {

		StringBuilder products = new StringBuilder();
		
		products.append("<products>");
		products.append("<product>");
		products.append("<name>MyProduct</name>");
		products.append("</product>");
		products.append("</products>");
			
		return products.toString();
	}
}
