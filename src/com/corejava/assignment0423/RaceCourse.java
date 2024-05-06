package com.corejava.assignment0423;

public class RaceCourse {
	String Location;
	String CircuitType;
	Vehicle [] Vehicle;
	
	public RaceCourse(String Location,String CircuitType,Vehicle [] Vehicle ) {
		this.Location=Location;
		this.CircuitType = CircuitType;
		this.Vehicle = Vehicle;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle Vehicle = new Vehicle("Nascar", "ModelX",2024,4,60);
		System.out.println("Selected Gear for Normal Vehicle: "+Vehicle.changeGearWithSpeed(60));
		
		Vehicle Nascar = new Nascar("Nascar", "ModelX",2024,4,60,1200,5);
		System.out.println("Selected Gear for Nascar: "+Nascar.changeGearWithSpeed(60));
		
		Vehicle FormulaOnecar = new FormulaOnecar("Nascar", "ModelX",2024,4,60,1400,6);
		System.out.println("Selected Gear for FormulaOneCar: "+FormulaOnecar.changeGearWithSpeed(60));
		
	}
}
