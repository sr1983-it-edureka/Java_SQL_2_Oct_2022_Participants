package com.edureka.javasql2.restservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path(value = "/hello")
public class Hello {

	@GET
	public String sayHello() {
		
		return "Hello - from REST Services via Jersey";
	}
}
