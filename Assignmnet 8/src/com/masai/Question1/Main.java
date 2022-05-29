package com.masai.Question1;

public class Main {

	public static void main(String[] args) {
		
		Bird b1 = new Parrot();
		b1.fly();
		
		Parrot tota=(Parrot)b1;
		tota.sing();

	}

}
