package com.corejava.assignments0420;

public class spinneyshypermarket extends hypermarket{
	
	public spinneyshypermarket()  {
		ItemsList = new String[] {"Eggs","Sugar","Milk","Chicken","Wheat","Drink","Salt"};
		PriceList= new int[] {60, 70, 300, 40, 200,320,120};
	}
	
	public static void main(String[] args) {
		spinneyshypermarket spinneys = new spinneyshypermarket();
		String[] Customer1List = {"Eggs","Sugar","Milk","Chicken","Wheat"};
		System.out.println("Final Bill Amount: "+spinneys.Generatebill(Customer1List));
		String[] Customer2List = {"Eggs","Sugar","Milk","Wheat","Drink"};
		System.out.println("Final Bill Amount: "+spinneys.Generatebill(Customer2List));
		String[] Customer3List = {"Eggs","Chicken","Wheat","Salt"};
		System.out.println("Final Bill Amount: "+spinneys.Generatebill(Customer3List));

	}
}
