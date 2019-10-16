package com.bean;

public abstract class people {
	public people(String name, int age, String sex, String adression, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.adression = adression;
		this.phoneNumber = phoneNumber;
	}
	public String getAdression() {
		return adression;
	}
	public void setAdression(String adression) {
		this.adression = adression;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	protected String name;
	protected int age;
	protected String sex;
	protected String adression;
	protected String phoneNumber;

}
