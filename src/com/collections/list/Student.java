package com.collections.list;

import java.util.Arrays;

public class Student {
	int rollNo;
	String name;
	String[] subjects;
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subjects=" + Arrays.toString(subjects) + "]";
	}
	
	
}
