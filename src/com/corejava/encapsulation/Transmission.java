package com.corejava.encapsulation;

public class Transmission {
	
	private String transmissionType;
	private int numGears;
	private String transmissionMake;
	
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	public int getNumGears() {
		return numGears;
	}
	public void setNumGears(int numGears) {
		this.numGears = numGears;
	}
	public String getTransmissionMake() {
		return transmissionMake;
	}
	public void setTransmissionMake(String transmissionMake) {
		this.transmissionMake = transmissionMake;
	}
	
	@Override
	public String toString() {
		return "Transmission [transmissionType=" + transmissionType + ", numGears=" + numGears + ", transmissionMake="
				+ transmissionMake + "]";
	}
	
	
}
