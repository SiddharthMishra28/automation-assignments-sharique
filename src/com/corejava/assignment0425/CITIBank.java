package com.corejava.assignment0425;

public class CITIBank extends Banking {
	
	public String getCreditScore() {
		return "CITICredited";
	}
	
	public String getDebitScore() {
		return "CITIDebited";
	}
	
	@Override
	public double getcalculatedtax() {
		// TODO Auto-generated method stub
		return 9.6;
	}


	@Override
	public double getcalculatedvat() {
		// TODO Auto-generated method stub
		return 11.5;
	}
}
