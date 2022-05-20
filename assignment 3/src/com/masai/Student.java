package com.masai;

public class Student {
	
	int roll=10;
	String name="priyanshu";
	int marks=66;
	
	void displayStudentDetails() {
		System.out.println("Roll is: "+new Student().roll);
		System.out.println("Name is: "+new Student().name);
		System.out.println("Marks is: "+new Student().marks);
		
	}
	void displayStudentDetails(int roll,String name,int marks) {
		System.out.println("Roll is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Marks is: "+marks);
		
	}

	public static void main(String[] args) {
		new Student().displayStudentDetails();
		new Student().displayStudentDetails(11,"sumit",96);
		
		
		

	}

}
