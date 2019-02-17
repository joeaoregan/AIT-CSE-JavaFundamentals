package com.ait.cars;

public class Car {
	private String registration;
	private String make;
	private String model;
	private String color;
	private int kilometers;
	private static int numberOfCars;
	
	public Car(String registration, String make, String model, String color){
		this.registration=registration;
		this.make=make;
		this.model=model;
		this.color=color;
		this.kilometers=0;
		numberOfCars++;
	}

	public String getRegistration() {
		return registration;
	}
	
	public int getKilometers(){
		return kilometers;
	}
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
	@Override
	public String toString() {
		return "Car Details [Reg=" + registration + ", make=" + make + ", model=" + 
				model + ",color= "+color+", kilometers="+kilometers+"]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color=color;
		
	}

	public void setKilometers(int kilometers) {
		this.kilometers=kilometers;
		
	}

}
