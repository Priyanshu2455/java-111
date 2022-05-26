package com.masai_Question2;

public class Student {
	
	public int studId;
	public String StudName;
	public double examFee;
	
	public void displayDetails() {
		
	}
	
	double payFee() {
		return this.examFee ;
		
	}
	
	public  Student(int studId,String studName,double examfee, double examFee){
		this.studId=studId;
		this.StudName=studName;
		this.examFee=examFee;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStuId() {
		return studId;
	}

	public void setStuId(int stuId) {
		this.studId = stuId;
	}

	public String getStudName() {
		return StudName;
	}

	public void setStudName(String studName) {
		this.StudName = studName;
	}

	public double getExamFee() {
		return examFee;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	
	
	
	

}


