package com.corejava.encapsulation;
// IS-A
public class UserProfile extends User{
	
	private String profilePicUrl;
	private String bio;
	public String hobbies;
	String gender; // DEFAULT ONLY ACCESSIBLE WITHIN SAME PACKAGE
	
	public void setProfilePicUrl(String url) {
		this.profilePicUrl = url;
	}
	
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public String getProfilePicUrl() {
		return this.profilePicUrl;
	}
	
	public String getBio() {
		return this.bio;
	}
	
}
