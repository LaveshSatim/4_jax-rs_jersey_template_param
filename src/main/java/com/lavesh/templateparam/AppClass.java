package com.lavesh.templateparam;

import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/temp")
public class AppClass {

	@GET
	@Path("{id}/{name}/type")
	@Produces("text/plain")
//	@Produces(MediaType.TEXT_PLAIN)
	public String get(@PathParam("id") String id, @PathParam("name") String name) {

		return " " + UUID.randomUUID().toString() + " " + " id  : " + id + " name : " + name;
	}
}
