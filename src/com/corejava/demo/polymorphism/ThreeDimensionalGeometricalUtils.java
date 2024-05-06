package com.corejava.demo.polymorphism;

public class ThreeDimensionalGeometricalUtils extends GeometricCalculationUtilities{
	
	int height;
	
	public ThreeDimensionalGeometricalUtils(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}
	
	// METHOD OVERRIDING
	public double calcaulteAreaRectangle() {
		return 0.8 * length * width;
	}
	
	// POLYMORPHISM
	// POLY - multiple
	// MORPH - more than one trasformations
	// SAME NAME - DIFFERENT TASKS are performed
	public double calculateVolume() {
		return Math.PI * length * length * height;
	}
	// METHOD OVERLOADING
	public double calculateVolume(boolean isConical) {
		if(isConical) {
			return 0.33 * Math.PI * length * length * height;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		ThreeDimensionalGeometricalUtils utils = new ThreeDimensionalGeometricalUtils(3, 4, 5);
		System.out.println(utils.calculateVolume(true));
		System.out.println(utils.calcaulteAreaRectangle());
		
		GeometricCalculationUtilities utils1 = new GeometricCalculationUtilities(3, 4);
		System.out.println(utils1.calculateAreaRectangle());
	}
}
