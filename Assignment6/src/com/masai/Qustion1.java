package com.masai;
import java.util.*;

// reverse the array.

public class Qustion1 {
	
	static String reverseString(String[] userInput, int size) {
		String bag="";
		for(int i=size-1;i>=0;i--) {
			bag+=userInput[i]+" ";
		}
		return bag;
		
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		String[] userInput=new String[size];
		// input
    for(int i=0;i<size;i++) {
    	userInput[i]=input.next();
    }
    String res=reverseString( userInput,size);
  
    System.out.println("Reversed String --"+res);
    

	}

}
