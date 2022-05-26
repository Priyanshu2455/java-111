package com.masai_Question4;

public class Axis extends Bank {
	public double rateOfInt=7.0;
	
	@Override
	
	public void dispalyDetail() {
		System.out.println("Branch Name :Axis bank" );
		System.out.println("Ifsc code :ICICI bank" );
		System.out.println("Rate of intrest"+rateOfInt);
	}
	
	public void getCreditcard() {
		System.out.println("get the credit card from the Axis bank");
	}

}
