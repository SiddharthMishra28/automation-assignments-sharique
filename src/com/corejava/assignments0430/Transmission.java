package com.corejava.assignments0430;

public class Transmission {

	private String transmissionType;
	private int wheels;
	private String tansmissionOilType;
	private String gearBoxType;
	private int GearNum;
	public static String carStatus;

	public int getGearNum() {
		return GearNum;
	}

	public void setGearNum(int gearNum) {
		GearNum = gearNum;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getTansmissionOilType() {
		return tansmissionOilType;
	}

	public void setTansmissionOilType(String tansmissionOilType) {
		this.tansmissionOilType = tansmissionOilType;
	}

	public String getGearBoxType() {
		return gearBoxType;
	}

	public void setGearBoxType(String gearBoxType) {
		this.gearBoxType = gearBoxType;
	}

	public void changeGear(Engine engine, Transmission transmission, Body body, int speed) {
		CarMethods CarMethods = new CarMethods();
		CarMethods.startCar(engine, transmission, body);
		if (CarMethods.carStarted) {
			carStatus = "Changed Gear with speed of " + speed;
		} else {
			carStatus = "Please First Start the Card";
		}
	}
	
	//Overloading
	public void changeGear(int speed) {
		CarMethods CarMethods = new CarMethods();
		CarMethods.startCar();
		if (CarMethods.carStarted) {
			carStatus = "Changed Gear with speed of " + speed;
		} else {
			carStatus = "Please First Start the Car";
		}

	}

	@Override
	public String toString() {
		return "Transmission Type = " + transmissionType + ", Wheels = " + wheels + ", Tansmission Oil Type = "
				+ tansmissionOilType + ", Gear Box Type = " + gearBoxType;
	}

}
