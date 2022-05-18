package com.masai;

public class Prime_factor {

	public static void main(String[] args) {
		int num=12;
		String bag="";
		for(int i=1;i<=num;i++) {
			if (12%i==0) {
				bag+=i+" ";
			}
		}
		System.out.println(bag);
		
	}

}
