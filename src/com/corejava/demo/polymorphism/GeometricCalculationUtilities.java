package com.corejava.demo.polymorphism;

public class GeometricCalculationUtilities extends AreaUtils{
	
	int length;
	int width;
	
	public GeometricCalculationUtilities(int length, int width) {
		this.width = length;
		this.length = width;
	}
	
	public double calculateAreaTriangle() {
		return 0.5 * length * width;
	}
	
	public double calculateAreaRectangle() {
		return length * width;
	}
	
}
