package com.corejava.assignments0430;

public class Vehicle {
	
	private Engine engine;
	private Transmission transmission;
	private Body body;
	
	public Vehicle(Engine engine, Transmission transmission, Body body) {
		super();
		this.engine = engine;
		this.transmission = transmission;
		this.body = body;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Vehicle Detail is as follows: \n"+ 
				"Engine Details : " + engine + 
				",\nTransmission Details : " + transmission +
				",\nBody Details : " + body+"\nCar Status is: " + Transmission.carStatus+"\n";
	}
	
	

}
