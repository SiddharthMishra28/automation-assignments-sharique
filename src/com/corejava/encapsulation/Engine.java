package com.corejava.encapsulation;

public class Engine {
	
	private String make;
	private String model;
	private double engineCapacity;
	private int numCylinders;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getNumCylinders() {
		return numCylinders;
	}
	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}
	
	@Override
	public String toString() {
		return "[ "+this.make+
				", "+this.model+
				", "+this.numCylinders+", "
				+this.engineCapacity+" ]";
	}
	
}
