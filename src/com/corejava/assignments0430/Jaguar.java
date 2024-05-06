package com.corejava.assignments0430;

public class Jaguar extends Vehicle {

	public Jaguar(Engine engine, Transmission transmission, Body body) {
		super(engine, transmission, body);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Engine E1 = new Engine();
		E1.setEnginecylinder(8);
		E1.setFuelInjectors("DummyInjectors");
		E1.setSparkplug("Jaguar");

		Transmission T1 = new Transmission();
		T1.setGearBoxType("GearDummy");
		T1.setTansmissionOilType("DummyOilType");
		T1.setTransmissionType("Manual");
		T1.setWheels(4);

		Body B1 = new Body();
		B1.setBodyColor("Green");
		B1.setBodyDesign("Coupe");
		B1.setBodyType("Sedan");
		B1.setNumOfDoors(2);

		Engine E2 = new Engine();
		E2.setEnginecylinder(6);
		E2.setFuelInjectors("DummyInjectors");
		E2.setSparkplug("Jaguar");

		Transmission T2 = new Transmission();
		T2.setGearBoxType("GearDummy");
		T2.setTansmissionOilType("DummyOilType");
		T2.setTransmissionType("Automatic");
		T2.setWheels(4);

		Body B2 = new Body();
		B2.setBodyColor("Red");
		B2.setBodyDesign("Coupe");
		B2.setBodyType("Mini");
		B2.setNumOfDoors(2);

		T1.changeGear(E1, T1, B1, 200);
		Jaguar J1 = new Jaguar(E1, T1, B1);
		System.out.println(J1);

		T2.changeGear(200);
		Jaguar J2 = new Jaguar(E2, T2, B2);
		System.out.println(J2);

	}

}
