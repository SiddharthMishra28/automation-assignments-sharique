package com.corejava.assignments0420;

public class luluhypermarket extends hypermarket{
	
	public luluhypermarket()  {
		ItemsList = new String[] {"Eggs","Sugar","Milk","Chicken","Wheat"};
		PriceList= new int[] {100, 200, 300, 400, 500};
	}
	public static void main(String[] args) {
		luluhypermarket lulu = new luluhypermarket();
		String[] Customer1List = {"Eggs","Sugar","Milk","Chicken","Wheat"};
		System.out.println("Final Bill Amount: "+lulu.Generatebill(Customer1List));
		String[] Customer2List = {"Eggs","Sugar","Milk","Wheat"};
		System.out.println("Final Bill Amount: "+lulu.Generatebill(Customer2List));
		String[] Customer3List = {"Eggs","Chicken","Wheat"};
		System.out.println("Final Bill Amount: "+lulu.Generatebill(Customer3List));	
	}
}
