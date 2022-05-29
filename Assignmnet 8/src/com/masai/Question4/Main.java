package com.masai.Question4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal a1 = new Animal();
		Animal[] arr = new Animal[3];
		arr[0]=new Dog();
		arr[1]=new Cat();
		arr[2]=new Tiger();
		
//		for(Animal x:arr) {
//			
//			System.out.println(x.makeNoice());
//			System.out.println(x.eat());
//			System.out.println(x.walk());
//		}

		for(int i=0;i<arr.length;i++) {
			arr[i].eat();
			arr[i].makeNoice();
			arr[i].walk();
			System.out.println("=============================");
		}
	}

}
