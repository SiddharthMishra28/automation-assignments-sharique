package com.corejava.assignment0423;

public class Vehicle {
	String Make;
	String Model;
	int Year;
	int Seats;
	double Speed;
	
	public Vehicle(String Make, String Model, int Year, int Seats,double Speed) {
		this.Make= Make;
		this.Model = Model;
		this.Year = Year;
		this.Seats = Seats;
		this.Speed = Speed;
		
	}
	
	public int changeGearWithSpeed(int Speed) {
		
		if (Speed <= 50) {
			return 3;
		}
		else if (Speed > 50 && Speed <=100) {
			return 5;
		} else {
			return 6;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
