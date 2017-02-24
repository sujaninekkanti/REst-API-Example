package com.restsample;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
public List<User> getAllUsers(){
 List<User> Userlist = null;
 User user = new User("sujani","abcde..",1);
 User user1 = new User("nekkanti","bhimavaram",2);
 Userlist = new ArrayList<User>();
 Userlist.add(user);
 Userlist.add(user1);
 System.out.println("in dao user");
	return Userlist;
}
}
