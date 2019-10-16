package com.bean;

public class student extends people {
	@Override
	public String toString() {
		return super.name+" "+super.age+" "+super.sex+" "+super.adression+" "+super.phoneNumber+" "+this.student_ID;
	}

	public student(String name, int age, String sex, String adression, String phoneNumber, String student_ID) {
		super(name, age, sex, adression, phoneNumber);
		this.student_ID = student_ID;
	}

	public student(String name, int age, String sex, String adression, String phoneNumber) {
		super(name, age, sex, adression, phoneNumber);
		
	}

	public String getStudent_ID() {
		return student_ID;
	}

	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}

	private String student_ID;
	
}
