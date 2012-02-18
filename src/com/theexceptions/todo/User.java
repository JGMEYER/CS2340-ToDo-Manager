package com.theexceptions.todo;

/**
 * A Model to store and pass user information.
 * @author Justian Meyer
 */
public class User {
	
	private int userID;
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User(int userID, String username, String password, String name, String email) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
