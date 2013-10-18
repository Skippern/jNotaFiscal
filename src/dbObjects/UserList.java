package dbObjects;
/**
 * 
 * @author Aun Johnsen
 * 
 * Creates a list of registered users that are allowed to log into this
 * application, this object is used in the login manager
 *
 */
public class UserList {
	private String uname;
	private String pw;
	private int uid;
	private int eid;
	private boolean adminUser = false;
	
	/**
	 * 
	 * @param username 
	 * <p>User login name
	 * @param passwd
	 * <p>Password
	 * @param UID
	 * <p>User ID
	 * @param EID
	 * <p>EmployeeID - Employee object
	 * @param AID
	 * <p>AvatarID - Avatar object
	 * @param admin
	 * <p>Give this user admin rights
	 */
	public UserList(String username, String passwd, int UID, int EID, int AID, boolean admin) {
		uname = username;
		pw = passwd;
		uid = UID;
		eid = EID;
		adminUser = admin;
	}
	public String getUsername() {
		return uname;
	}
	public int getUID() {
		return uid;
	}
	public int getEID() {
		return eid;
	}
	public boolean isAdmin() {
		return adminUser;
	}
	/**
	 * 
	 * @param password
	 * <p> Password to test against stored password
	 * @return
	 * <p> True if password matches
	 */
	public boolean verifyPassword(String password) {
		if (password == pw) return true;
		else return false;
	}
}
