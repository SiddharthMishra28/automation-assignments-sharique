package com.corejava.encapsulation;

public class Chassis {
	
	private String chassisType;
	private String chassisMetal;
	
	public String getChassisType() {
		return chassisType;
	}
	public void setChassisType(String chassisType) {
		this.chassisType = chassisType;
	}
	public String getChassisMetal() {
		return chassisMetal;
	}
	public void setChassisMetal(String chassisMetal) {
		this.chassisMetal = chassisMetal;
	}
	@Override
	public String toString() {
		return "Chassis [chassisType=" + chassisType + ", chassisMetal=" + chassisMetal + "]";
	}
	
	
}
