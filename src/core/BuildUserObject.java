package core;

import db.ConnectInternal;
import dbObjects.*;
/**
 * 
 * @author Aun Johnsen
 * <p> This function is called from the core to build a searchable
 * ArrayList with users allowed to log into the program. This is 
 * needed by the LoginManager
 */
public class BuildUserObject {
	/*
	 * First we connect to the internal database
	 */
	private int userID; // "NOTAFISCAL"."USER"."ID"
	private String userName; // "NOTAFISCAL"."USER"."username"
	private boolean adminUser = false; // "NOTAFISCAL"."USER"."AdminUser"
	private int userEID; // "NOTAFISCAL"."USER"."eID"
	private Employee userEmployee; // Employee object based on eID
	
	public BuildUserObject() {
		/*
		 * When we have a connection we connect to the USER
		 * table and select *
		 * SELECT * FROM "NOTAFISCAL"."USER"
		 * For each line we make an User object and add it to the the ArrayList
		 */
	}
	
	public int getUID() {
		return userID;
	}
	public String getUserName() {
		return userName;
	}
	public boolean isAdmin() {
		return adminUser;
	}
	public int getEID() {
		return userEID;
	}
	public Employee getEmployee() {
		return userEmployee;
	}
}
