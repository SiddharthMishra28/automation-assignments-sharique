package com.corejava.encapsulation;
// HAS A Transmission
// HAS A Engine
// HAS A chassis
public class Vehicle {
	
	private Engine engine;
	private Chassis chassis;
	private Transmission transmission;
	
	public Vehicle(Engine engine, Chassis chassis, Transmission transmission) {
		this.engine = engine;
		this.chassis = chassis;
		this.transmission = transmission;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Chassis getChassis() {
		return chassis;
	}

	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", chassis=" + chassis + ", transmission=" + transmission + "]";
	}
	
	
}
