package com.corejava.demo.polymorphism;

public class School {
	String name;
	String location;
	Person[] persons;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.fullName = "Saahil";
		s1.email = "saahil@test.com";
		s1.phone = "721739821";
		
		Teacher t1 = new Teacher();
		t1.fullName = "Sahid";
		t1.email = "sahid@test.com";
		t1.phone = "0213821093";
		t1.subjects = new String[]{"physics", "maths", "english"};
		
		School globalSchool = new School();
		globalSchool.name = "globalSchool";
		globalSchool.location = "Pune";
		globalSchool.persons = new Person[] {t1, s1};
		
		globalSchool.persons[0].getPersonDetails();
	}
}
