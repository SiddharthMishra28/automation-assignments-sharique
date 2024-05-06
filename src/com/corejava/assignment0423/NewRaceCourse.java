package com.corejava.assignment0423;

public class NewRaceCourse {
	String Location;
	String CircuitType;
	NewVehicle[] NewVehicle; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewNasCar NS = new NewNasCar();
		NS.make = "Nascar";
		NS.model = 2024;
		NS.enginesize = 2500;
		NS.ManufacturingCompany = new String[]{"BMW","Bentley","Audi"};
		
		NewNasCar NS1 = new NewNasCar();
		NS1.make = "Nascar1";
		NS1.model = 2024;
		NS1.enginesize = 2500;
		NS1.ManufacturingCompany = new String[]{"Merc","Nissan","Range Rover"};
		
		NewFormulaOneCar NFC = new NewFormulaOneCar();
		NFC.make = "New Formula One Car";
		NFC.model = 2024;
		NFC.enginesize = 2500;
		NFC.Manufacturer = "Ferari";
		NFC.DriverNames = new String[] {"Rox","Zen","Benny"};
		
		NewFormulaOneCar NFC1 = new NewFormulaOneCar();
		NFC1.make = "New Formula One Car1";
		NFC1.model = 2024;
		NFC1.enginesize = 2500;
		NFC1.Manufacturer = "Ferari";
		NFC1.DriverNames = new String[] {"Rox","Zen","Benny","Khadija"};
		
		NewRaceCourse NRC = new NewRaceCourse();
		NRC.Location = "Belgium";
		NRC.CircuitType = "Spa-Francorchamps";
		NRC.NewVehicle = new NewVehicle[] {NS, NFC,NFC1,NS1};
		
		NRC.NewVehicle[0].GetNewVehicleDetails();
		System.out.println();
		NRC.NewVehicle[1].GetNewVehicleDetails();
		System.out.println();
		NRC.NewVehicle[2].GetNewVehicleDetails();
		System.out.println();
		NRC.NewVehicle[3].GetNewVehicleDetails();
	}
}
