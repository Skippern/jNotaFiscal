package dbObjects;
/**
 * @author Aun Johnsen
 * <p>
 * This object should not allow users to change attributes, as this is
 * used to grant access within the program. To change attributes, call 
 * the database through the proper channels, exit the program and log in
 * again. This object should then hold the new attributes.
 */

public class User {
	private String uname;
	private int eid;
	private int uid;
	private boolean adminuser = false;
	/**
	 * @param String login: The username from which the object pushes its data
	 * <p>
	 * A test user allows to check how the program works without
	 * having a working database
	 */
	public User(String login) {
		if (login == "test") {
			uname = "test";
			eid = 0;
			uid = 0;
		} else if (login == "admin") {
			uname = "admin";
			eid = 0;
			uid = 0;
			adminuser = true;
		} else {
			uname = login;
			/*
			 *  Check the other variables from a database file
			 *  
			 *  Table: User
			 *  Fields:
			 *  	ID primary key autoindex unique INT (@uid)
			 *  	username TEXT (@uname)
			 *  	password TEXT encrypted (@password)
			 *  	EmployeeID INT (@eid)
			 *  	AdminUser BOOLEAN (@adminuser)
			 */
		}	
	}
	
	public String getUsername() {
		return uname;
	}
	public int getEID() {
		return eid;
	}
	public int getUID() {
		return uid;
	}
	/**
	 * 
	 * @return true if user is admin, false if not admin
	 */
	public boolean isAdmin() {
		return adminuser;
	}
}
