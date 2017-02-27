package com.restsample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao{
	
public List<User> getAllUsers() throws Exception{
	//DBConnection db = new DBConnection();
	
		//throws Exception{
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
 
 
 /* User user = new User("sujani","abcde..",1);
 User user1 = new User("nekkanti","bhimavaram",2);
 Userlist = new ArrayList<User>();
Userlist.add(user);
 Userlist.add(user1);

	return Userlist;*/
}

public int addUser(User user) throws Exception {
	// List<User> Userlist = null;
	// Userlist = new ArrayList<User>();
	 //return 1;
	  // List<User> userList = getAllUsers(); 
	
	System.out.println("in add user method");
	try{
		Connection con = DBConnection.getConnection();
		System.out.println("after getting connection in dao class");
		 PreparedStatement ps = con.prepareStatement("insert into usersample values(?,?,?)");
		 //ResultSet rs =ps.executeQuery();
		
			 //User user = new User();
			 
		 System.out.println("in dao user before insert");
			 ps.setString(1,user.getName());
			 ps.setString(2,user.getAddress());
			 ps.setInt(3,user.getId());	 
			 int result =ps.executeUpdate(); 
			 System.out.println("in dao user after insert");
			 
				DBConnection.closeConnection(con);
				return result;
			 
		  }
	 catch(Exception ei){
		throw ei;
	 }
	     
	   }
	 
}

