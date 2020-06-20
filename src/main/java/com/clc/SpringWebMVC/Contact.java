package com.clc.SpringWebMVC;

public class Contact {

	private String name;
	private int number;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", country=" + country + "]";
	}
	public Contact(String name, int number, String country) {
		super();
		this.name = name;
		this.number = number;
		this.country = country;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
