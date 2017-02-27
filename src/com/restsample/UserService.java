package com.restsample;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
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
	
	  @POST 
	   @Path("/insert") 
	  // @Produces(MediaType.APPLICATION_JSON) 
	   @Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	   public String createUser(@FormParam("username") String name, @FormParam("address") String address,  @FormParam("id") int id) throws Exception{ 
	      System.out.println("in user insert service");
		  User user = new User(name,address,id); 
	      int result = userdao.addUser(user); 
	      if(result == 1){ 
	         return "SUCCESS_RESULT"; 
	      } 
	      return "FAILURE_RESULT"; 
	   } 
	
}
