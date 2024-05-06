package com.corejava.demo.abstraction;

public class VodafoneSim extends SimCard{

	public VodafoneSim(String networkCarrier) {
		super(networkCarrier);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//VodafoneSim vodafoneCard = new VodafoneSim("vodafone");
	}

	// ENFORCING A CONTRACT
	@Override
	public void getGenerationFrequency(String generation) {
		// TODO Auto-generated method stub
		// VODAFONE SPECIFIC LOGIC
	}
}
