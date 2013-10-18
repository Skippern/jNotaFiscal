package core;

import java.util.ArrayList;
import dbObjects.*;

/**
 * 
 * @author Aun Johnsen
 * 
 * Creates a core object that can be called from all over the program
 *
 */
public final class Core {
	public static final String version = "pre-alfa.0.0.0";
	public ArrayList<UserList> userList;
	public User user;

	public Core() {
		System.out.println("Core loaded with version: " + version);
		
//		userList.add(new UserList("test","test",0,0,0,false));
//		userList.add(new UserList("admin","admin",0,0,0,true));
		/* If connected to local database, this list should be overwritten
		 * with actual userlist found in that database  - replication towards
		 * central server can update and alter this list
		 */
	}
	
	public String getVersion() {
		return version;
	}
	public ArrayList<UserList> getUsers() {
		return userList;
	}
	public User getUser() {
		return user;
	}
	
	public void setUser(String username) {
		user = new User(username);
	}

}
