package com.corejava.assignments0430;

public class CarMethods {

	boolean carStarted = false;
	boolean carstopped = false;

	public boolean startCar(Engine engine, Transmission transmission, Body body) {
		carStarted = true;
		return carStarted;
	}

	public boolean startCar() {
		carStarted = false;
		return carStarted;
	}

	public boolean stopCar() {
		carstopped = true;
		return carstopped;
	}

}
