package com.masai_Question4;

public class Icici extends Bank {
public double rateOfInt=8.5;
	
	@Override
	
	public void dispalyDetail() {
		System.out.println("Branch Name :Axis bank" );
		System.out.println("Ifsc code :ICICI bank" );
		System.out.println("Rate of intrest"+rateOfInt);
	}

}
