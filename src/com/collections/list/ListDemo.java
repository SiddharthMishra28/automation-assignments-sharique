package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		// < GENERICS >
		List<String> myStudents = new ArrayList<>();
		List<Integer> myIntList = new ArrayList<>();
		myStudents.add("Sid");
		myStudents.add("mishra");
		myIntList.add(12);
		System.out.println(myStudents);
		
		List<Student> students = new ArrayList<>();
		Student student = new Student();
		student.name = "sid";
		student.rollNo = 1;
		student.subjects = new String[] {"physics", "maths", "science"};
		students.add(student);
		System.out.println(students);
	}
}
