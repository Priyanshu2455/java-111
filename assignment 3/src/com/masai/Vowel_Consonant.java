package com.masai;

public class Vowel_Consonant {
	
	char alpha= 'h';
	
		char vowels[]= {'a','e','i','o','u'};
	

	public static void main(String[] args) {
		
		 Vowel_Consonant vowel= new Vowel_Consonant();
//		 System.out.println(vowel.vowels);
		 
		 for(int i=0;i<vowel.vowels.length;i++) {
			 if(vowel.alpha==vowel.vowels[i]) {
				 System.out.println(vowel.alpha+" is vowel");
				 break;
			 }
			 else {
				 System.out.println(vowel.alpha+" is consonent");
				 break;
			 }
			 
		 }
		

	}

}
