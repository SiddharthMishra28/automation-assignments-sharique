package com.corejava.assignment0423;

public class NewNasCar extends NewVehicle {
	
	String[] ManufacturingCompany;
	
	@Override
	public void GetNewVehicleDetails() {
		System.out.println("Vehicle Detials are ");
		System.out.println("Make: "+this.make);
		System.out.println("Model: "+this.model);
		System.out.println("Engine Size: "+ this.enginesize);
		for(String s : this.ManufacturingCompany) {
			System.out.println("Manufacturing Company: "+s);
		}
	}

}
