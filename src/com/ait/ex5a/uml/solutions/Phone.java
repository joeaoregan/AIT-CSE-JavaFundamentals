package com.ait.ex5B;

public class Phone {
	private String phoneNumber;
	private String ownersName;
	private double price;
	
	public Phone(){
		this.phoneNumber = "123456";
		this.ownersName = "Tom";
		this.price = 59.99;
	}

	public Phone(String phoneNumber, String ownersName, double price) {
		this.phoneNumber = phoneNumber;
		this.ownersName = ownersName;
		this.price = price;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getOwnersName() {
		return ownersName;
	}

	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
