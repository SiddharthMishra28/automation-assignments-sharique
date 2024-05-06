package com.corejava.assignment0423;

public class Nascar extends Vehicle {
	int EngineCapacity;
	int NumOfGears;

	
	public Nascar(String Make, String Model, int Year, int Seats,int Speed,int EngineCapacity,int NumOfGears) 
	{
		super (Make, Model,Year,Seats,Speed);
		this.EngineCapacity = EngineCapacity;
		this.NumOfGears = NumOfGears;
		this.Speed = Speed;
	}
	
	public int changeGearWithSpeed(int Speed) {
		
		if (Speed <= 20) {
			return 3;
		}
		else if (Speed > 20 && Speed <=70) {
			return 5;
		} else {
			return 6;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
