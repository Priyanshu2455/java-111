package com.masai;
import java.util.*;

	
	class Employee {
		
		private int employeeId;
		private String employeeName;
		private double salary;
		private double netSalary;
		private int pf;
		// id
		public void setId(int id) {
			this.employeeId=id;
		}
		public int getId() {
			return  employeeId;
		}
		//name
		public void setName(String name) {
			this.employeeName=name;
		}
		public String getName() {
			return  employeeName;
		}
		//salary
		public void setSalary(double salary) {
			this.salary=salary;
		}
		public double getSalary() {
			return  salary;
		}
       //PF
		public void setPf(int PF) {
			this.pf=PF;
		}
		public double getPf() { 
			double total = salary*(pf/100);
			double net=salary - total;
			return  net;
		}
		
		public void calculateNetSalary(int pfpercentage) {
			
			
		}	
	}
	
	public class EmployeeSalary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Employee obj=new Employee();
		
		obj.setId(sc.nextInt());
		int id =obj.getId();
		
		obj.setName(sc.nextLine());
		String names=obj.getName();
		sc.nextLine();
		obj.setSalary(sc.nextDouble());
		double salary=obj.getSalary();
		
		obj.setPf(sc.nextInt());
		double net=obj.getPf();
		
		System.out.println("Id: "+id);
		System.out.println("Name: "+ names);
		System.out.println("Salary: "+salary);
		System.out.println("pf: "+net);
			

	}

}
