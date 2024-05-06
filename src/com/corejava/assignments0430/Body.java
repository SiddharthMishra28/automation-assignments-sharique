package com.corejava.assignments0430;

public class Body {

	private String bodyType;
	private int numOfDoors;
	private String bodyColor;
	private String bodyDesign;

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public String getBodyDesign() {
		return bodyDesign;
	}

	public void setBodyDesign(String bodyDesign) {
		this.bodyDesign = bodyDesign;
	}

	@Override
	public String toString() {
		return "Body Type = " + bodyType + ", Num Of Doors = " + numOfDoors + ", Body Color = " + bodyColor
				+ ", Body Design = " + bodyDesign;
	}

}
