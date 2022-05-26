package com.masai_Question4;
import java.util.*;

public class Demo {
	public static Bank getBank(String bank) {
		if(bank.equals("Axis")) {
			return new Axis();
		}
		else if(bank.equals("ICICI")) {
			return new Icici();
		}
		else {
			
			return null;
		}
		
	}
	public static void main(String[] args) {
		System.out.println("enter bank name");
		Scanner sc=new Scanner(System.in);
		String bank=sc.next();
		Bank b1=Demo.getBank(bank);
		b1.dispalyDetail();
		

	}
	
	
	

 
}
