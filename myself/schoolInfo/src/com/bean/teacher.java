package com.bean;

public class teacher extends people {
	@Override
	public String toString() {
		return super.name+" "+super.age+" "+super.sex+" "+super.adression+" "+super.phoneNumber+" "+this.teacher_ID;
	}
	public teacher(String name, int age, String sex, String adression, String phoneNumber, String teacher_ID) {
		super(name, age, sex, adression, phoneNumber);
		this.teacher_ID = teacher_ID;
	}

	public teacher(String name, int age, String sex, String adression, String phoneNumber) {
		super(name, age, sex, adression, phoneNumber);
		
	}

	public String getTeacher_ID() {
		return teacher_ID;
	}

	public void setTeacher_ID(String teacher_ID) {
		this.teacher_ID = teacher_ID;
	}

	private String teacher_ID;
	

}
