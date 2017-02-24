package com.restsample;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
public List<User> getAllUsers(){
 List<User> Userlist = null;
 User user = new User("sujani","Achanta",1);
 Userlist = new ArrayList<User>();
 Userlist.add(user);
 System.out.println("in dao user");
	return Userlist;
}
}
