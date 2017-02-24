package com.restsample;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/userService")
public class UserService {
	UserDao userdao = new UserDao();
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
   public List<User> getUsers(){
	   return userdao.getAllUsers();
   }
}
