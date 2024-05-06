package com.corejava.assignments0430;

public class Engine {

	private int enginecylinder;
	private String sparkplug;
	private String fuelInjectors;

	public int getEnginecylinder() {
		return enginecylinder;
	}

	public void setEnginecylinder(int enginecylinder) {
		this.enginecylinder = enginecylinder;
	}

	public String getSparkplug() {
		return sparkplug;
	}

	public void setSparkplug(String sparkplug) {
		this.sparkplug = sparkplug;
	}

	public String getFuelInjectors() {
		return fuelInjectors;
	}

	public void setFuelInjectors(String fuelInjectors) {
		this.fuelInjectors = fuelInjectors;
	}

	@Override
	public String toString() {
		return "Engine Cylinder = " + enginecylinder + ", Spark Plug = " + sparkplug + ", Fuel Injectors = "
				+ fuelInjectors;
	}

}
