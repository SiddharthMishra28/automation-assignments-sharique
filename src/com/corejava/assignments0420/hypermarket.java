package com.corejava.assignments0420;

public class hypermarket {

	static String [] ItemsList;
	static int [] PriceList;
	
	public double Generatebill(String [] ItemsList) {
		double billamount=0;
		double discount=0.0;
		for (int i = 0; i < ItemsList.length; i++)
		{
			billamount = billamount+PriceList[i];
		}
		if (billamount>500 & billamount <= 750 ){
			discount = 3.0;
		}else if (billamount>750 & billamount <= 1000){
			discount = 5.0;
		}else if (billamount>1000) {
			discount = 7.0;
		}else {
			discount = 0.0;
		}
		System.out.println("Total Bill: "+billamount+", Applicable Discount: "+discount);
		double discountamount = billamount * (discount/100);
		return billamount = billamount - discountamount;	
	}
}
