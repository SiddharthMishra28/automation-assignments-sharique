package com.corejava.demo;

public class Bike {
	String make;
	String model;
	String type;
	int engineCapacity;
	int numGears;
	
	// ANOTHER CONSTRUCTOR
	public Bike(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	// PARAMETERIZED CONSTRUCTOR
	public Bike(String mk, String md, String typ, int ec, int ng) {
		this.make = mk;
		this.model = md;
		this.type = typ;
		this.engineCapacity = ec;
		this.numGears = ng;
	}
	
	// METHODS
	
	public static void main(String[] args) {
		// MANDATE - MINIMUM DATA REQIRED
		//Bike ninja = new Bike("Kawasaki", "Ninja", "Sports", 1100, 6);
	}
}	
