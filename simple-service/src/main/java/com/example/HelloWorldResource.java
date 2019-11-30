package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/{name: [a-zA-Z][a-zA-Z_0-9]*}")
public class HelloWorldResource {
	public static final String HELLO_SMS="Hello World";
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getSMS(@PathParam("name")String myname){
		return HELLO_SMS+" "+myname;
		
	}

}
