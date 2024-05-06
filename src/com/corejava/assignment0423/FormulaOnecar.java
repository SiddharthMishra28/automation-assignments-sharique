package com.corejava.assignment0423;

public class FormulaOnecar extends Vehicle {
	
	int EngineCapacity;
	int NumOfGears;
	
	public FormulaOnecar(String Make, String Model, int Year, int Seats,int EngineCapacity,int NumOfGears,double Speed) 
	{
		super (Make, Model,Year,Seats,Speed);
		this.EngineCapacity = EngineCapacity;
		this.NumOfGears = NumOfGears;
		this.Speed = Speed;
	}
	
	public int changeGearWithSpeed(int Speed) {
		
		if (Speed <= 10) {
			return 3;
		}
		else if (Speed > 10 && Speed <=50) {
			return 5;
		} else {
			return 6;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
