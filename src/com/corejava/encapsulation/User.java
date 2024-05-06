package com.corejava.encapsulation;

public class User {
	
	public String email; // PUBLICLY ACCESSIBLE
	private String password; // INSIDE SAME CLASS ONLY
	protected boolean isVerified; // ONLY ACCESSIBLE TO SAME CLASS OR CHILD CLASSES
	
	// SETTERS AND GETTERS
	// SET A VALUE , GET A VALUE
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
