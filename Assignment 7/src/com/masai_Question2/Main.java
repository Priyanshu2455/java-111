package com.masai_Question2;

public class Main {

	public static void main(String[] args) {
		
		Hosteller h1= new Hosteller();
		h1.setExamFee(25000.00+h1.getHostelFee());
		h1.setStuId(101);
		h1.setStudName("mohit");
		h1.setHostelFee(2000.00);
		
		System.out.println("Hosteller name :-"+h1.getStudName());
		System.out.println("Hosteller Id :-"+h1.getStuId());
		System.out.println("Hosteller HostelFee :-"+h1.getHostelFee());
		System.out.println("Hosteller Examfee :-"+h1.getExamFee());
		System.out.println("------------------------------");

		DayScholar s1=new DayScholar();
		s1.setExamFee(25000.00+h1.getHostelFee());
		s1.setStuId(101);
		s1.setStudName("mohit");
		s1.setTransportFee(5000.0);
		
		System.out.println("Dayscholar name :-"+s1.getStudName());
		System.out.println("Dayscholar Id :-"+s1.getStuId());
		System.out.println("Dayscholar HostelFee :-"+s1.getTransportFee());
		System.out.println("Dayscholar Examfee :-"+s1.getExamFee());
		
	}

}
