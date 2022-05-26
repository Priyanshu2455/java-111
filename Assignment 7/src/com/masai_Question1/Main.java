package com.masai_Question1;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setName("priyashu");
		e1.setAddress("bhagat singh");
		e1.setAge(21);
		e1.setPhoneNumber("123456789");
		e1.setSalary(15000.00);
		
		System.out.println("------------------");
		System.out.println("Employee Details");
		System.out.println("Name -"+e1.getName());
		System.out.println("Phone -"+e1.getPhoneNumber());
		System.out.println("Age -"+e1.getAge());
		System.out.println("Address -"+e1.getAddress());
		System.out.println("Salary -"+e1.printSalary());
		
		Manager m1=new Manager();
		m1.setName("eaxmple");
		m1.setAddress("nehru singh");
		m1.setAge(28);
		m1.setPhoneNumber("977654321");
		m1.setSalary(18000.00);
		
		System.out.println("------------------");
		System.out.println("Manager Details");
		System.out.println("Name -"+e1.getName());
		System.out.println("Phone -"+e1.getPhoneNumber());
		System.out.println("Age -"+e1.getAge());
		System.out.println("Address -"+e1.getAddress());
		System.out.println("Salary -"+e1.printSalary());
		
		

	}

}
