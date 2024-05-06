package com.corejava.demo.abstraction;

// PARTIAL ABSTRACTION
// BECAUSE WE CANNOT INSTANTIATE AN OBJECT OF ABSTRACT CLASS
public abstract class SimCard extends Card{
	
	String simType;
	String networkCarrier;
	String generation;
	double frequency;
	
	public SimCard(String networkCarrier) {
		this.networkCarrier = networkCarrier;
	}
	
	public void registerNetwork() throws InterruptedException {
		System.out.println("Searching for network");
		Thread.sleep(2000);
		System.out.println("Network registered to "+this.networkCarrier);
	}
	
	public abstract void getGenerationFrequency(String generation);
	
}
