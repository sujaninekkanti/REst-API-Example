package com.restsample;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.UriInfo;
@Path("/userService")
public class UserService {
	 //@Context
	 //private UriInfo context;
	UserDao userdao = new UserDao();
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
   public List<User> getUsers() throws Exception{
		System.out.println("in service class..");
	   return userdao.getAllUsers();
   }
}
