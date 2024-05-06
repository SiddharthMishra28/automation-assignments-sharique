package com.corejava.assignment0425;

public class Banking implements ISO90001 {
	
	public Banking () {
		this.getcalculatedtax();
		this.getcalculatedvat();
		this.getCreditScore();
		this.getDebitScore();
	}
	
	
	public String getCreditScore() {
		return "Credited";
	}
	
	public String getDebitScore() {
		return "Debited";
	}
	

	
	public static void main(String[] args) {
		CITIBank Citi = new CITIBank();
		System.out.println(Citi.getcalculatedtax());
		System.out.println(Citi.getcalculatedvat());
		System.out.println(Citi.getCreditScore());
		System.out.println(Citi.getDebitScore());
		
		BankOfAmerica BOA = new BankOfAmerica();
		System.out.println(BOA.getcalculatedtax());
		System.out.println(BOA.getcalculatedvat());
		System.out.println(BOA.getCreditScore());
		System.out.println(BOA.getDebitScore());
	}


	@Override
	public double getcalculatedtax() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double getcalculatedvat() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	public String getcustomername() {
		return "abd";
	}


	@Override
	public double getrandint() {
		// TODO Auto-generated method stub
		return 0;
	}

}
