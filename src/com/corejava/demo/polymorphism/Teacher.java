package com.corejava.demo.polymorphism;

public class Teacher extends Person{
	String[] subjects;
	
	public void teach(int index) {
		System.out.println("Started Teaching "+this.subjects[index]);
	}
	
	@Override
	public void getPersonDetails() {
		System.out.println("Person Detials are ");
		System.out.println(this.fullName);
		System.out.println(this.email);
		System.out.println(this.phone);
		for(String s : this.subjects) {
			System.out.println("Subject "+s);
		}
	}
}
