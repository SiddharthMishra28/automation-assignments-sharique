package com.corejava.assignment0423;

public class NewFormulaOneCar extends NewVehicle {
	
	String [] DriverNames;

	@Override
	public void GetNewVehicleDetails() {
		System.out.println("Vehicle Detials are ");
		System.out.println("Make: "+this.make);
		System.out.println("Model: "+this.model);
		System.out.println("Engine Size: "+ this.enginesize);
		System.out.println("Manufacturer: "+this.Manufacturer);
		for(String d : this.DriverNames) {
			System.out.println("Drivers: "+d);	
		}
		
	}

}
