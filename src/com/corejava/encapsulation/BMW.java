package com.corejava.encapsulation;

public class BMW extends Vehicle{
	
	private String dealer;

	public BMW(Engine engine, 
			Chassis chassis, 
			Transmission transmission,
			String dealer) {
		super(engine, chassis, transmission);
		this.dealer = dealer;
	}
	
	public static void main(String[] args) {
		Engine e = new Engine();
		e.setMake("Fiat");
		e.setEngineCapacity(2500);
		e.setModel("350L");
		e.setNumCylinders(6);
		
		Chassis c = new Chassis();
		c.setChassisMetal("Aluminium");
		c.setChassisType("Monocoque");
		
		Transmission t = new Transmission();
		t.setNumGears(7);
		t.setTransmissionMake("Volkswagen DCT13");
		t.setTransmissionType("DCT Automatic");
		
		BMW i8 = new BMW(e, c, t, "Darshil BMW");
		System.out.println(i8.getEngine().getMake());
	}
}
