package com.masai;

public class CheckWeather {

	public static void main(String[] args) {
		boolean isSnowing=false;
		boolean isRaining=false;
		double temp=40.0;
		
		if(isSnowing==true || isRaining==true || temp>50) {
			System.out.println("Let’s stay home.");
		}
		else {
			System.out.println("Let’s go out!");
		}
		

	}

}
