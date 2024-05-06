package com.corejava.demo;

public class Phone {
	// PROPERTIES
	String make;
	String model;
	int ramCapacity;
	float screenSize;

	
	//METHOD - VERBS (TYPICALLY)
	//<ACCESS SPECIFIER> <RETURN TYPE> <NAME OF METHOD>(ARGUMENTS / INPUTS){
	// ....
	// }
	public void switchOnPhone() {
		System.out.println("Phone Switched ON!");
	}
	
	public void switchOffPhone() {
		System.out.println("Phone Switched OFF!");
	}
	
	public static void main(String[] args) {
		// JDK AUTOMATICALLY PROVIDES A DEFAULT CONSTRUCTOR WITH 0 PARAMETERS
		Phone galaxyPhone = new Phone();
		galaxyPhone.make = "Samsung";
		galaxyPhone.model = "S22";
		galaxyPhone.ramCapacity = 8;
		galaxyPhone.screenSize = 6.5f;
		galaxyPhone.switchOnPhone();
	}
}
