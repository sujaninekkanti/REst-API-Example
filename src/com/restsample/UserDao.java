package com.restsample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao{
	//DBConnection db = new DBConnection();
public List<User> getAllUsers() throws Exception{
 List<User> Userlist = null;
 Userlist = new ArrayList<User>();
 try{
	 Connection con = DBConnection.getConnection();
	 PreparedStatement ps = con.prepareStatement("select * from usersample");
	 ResultSet rs =ps.executeQuery();
	 while(rs.next()){
		 User user = new User();
		 user.setName(rs.getString("name"));
		 user.setAddress(rs.getString("address"));
		 user.setId(rs.getInt("id"));
		 Userlist.add(user);
		 System.out.println("in dao user");
	 }
	 return Userlist;
 }
 catch(Exception e){
	throw e;
 }
 
 
  //User user = new User("sujani","abcde..",1);
 //User user1 = new User("nekkanti","bhimavaram",2);
 //Userlist = new ArrayList<User>();
// Userlist.add(user);
 //Userlist.add(user1);

	//return Userlist;
}
}
