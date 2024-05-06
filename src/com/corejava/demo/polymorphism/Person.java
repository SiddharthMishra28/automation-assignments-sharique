package com.corejava.demo.polymorphism;

public class Person {
	String fullName;
	String email;
	String phone;
	
	public void getPersonDetails() {
		System.out.println("Person Detials are ");
		System.out.println(this.fullName);
		System.out.println(this.email);
		System.out.println(this.phone);
	}
}
