package com.corejava.assignment0425;

public class BankOfAmerica extends Banking{
	
	public String getCreditScore() {
		return "BOACredited";
	}
	
	public String getDebitScore() {
		return "BOADebited";
	}
	
	@Override
	public double getcalculatedtax() {
		// TODO Auto-generated method stub
		return 5.6;
	}

	@Override
	public double getcalculatedvat() {
		// TODO Auto-generated method stub
		return 8.9;
	}

}
