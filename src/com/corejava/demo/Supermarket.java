package com.corejava.demo;



public class Supermarket {
	String [] ItemsList = {"Eggs","Sugar","Milk","Chicken"};
	static int [] PriceList= {100, 200, 300, 400};
	
	public void supermarket(String[]Itmlst) {
		this.ItemsList=Itmlst;
	}
	
	public static void Generatebill(String [] ItemsList) {
		int billamount=0;
		int discount=0;
		for (int i = 0; i < ItemsList.length; i++)
		{
			billamount = billamount+PriceList[i];
		}
		if (billamount>500){
			discount = 3;
		}else if (billamount>750){
			discount = 5;
		}else if (billamount>1000) {
			discount = 7;
		}else {
			discount = 0;
		}
		
		billamount = billamount- billamount*(discount/100);
		System.out.println(billamount);	
	}

	public static void main(String[] args) {
		// GENERATE BILL
		// if billamount > $500 - discount 3%
		// if billamount > $750 - discount 5%
		// if billamount > $1000 - discount 7%
		// DISPLAY FINAL AMOUNT
		String [] ItemsList = {"Eggs","Sugar","Milk","Chicken"};
		Generatebill(ItemsList);
		
	}
	
}
