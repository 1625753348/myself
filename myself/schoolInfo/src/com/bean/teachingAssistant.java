package com.bean;

public class teachingAssistant extends people {
	

	@Override
	public String toString() {
		return super.name+" "+super.age+" "+super.sex+" "+super.adression+" "+super.phoneNumber+" "+this.Assistant_ID;
	}

	public teachingAssistant(String name, int age, String sex, String adression, String phoneNumber,
			String assistant_ID) {
		super(name, age, sex, adression, phoneNumber);
		Assistant_ID = assistant_ID;
	}

	public teachingAssistant(String name, int age, String sex, String adression, String phoneNumber) {
		super(name, age, sex, adression, phoneNumber);
		
	}

	public String getAssistant_ID() {
		return Assistant_ID;
	}

	public void setAssistant_ID(String assistant_ID) {
		Assistant_ID = assistant_ID;
	}

	private String Assistant_ID;

}
