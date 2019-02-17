package com.ait.cars;

import java.util.Scanner;

public class CarFactory {
	private static Scanner sc;

	public static void main(String[] args) {
		CarDB carDB = new CarDB();
		sc = new Scanner(System.in);
		System.out.println("Welcome to the Car Application");
		char c = 'y';
		try {
			while (c != 'x') {
				System.out.println("------------------------------------------------------");
				System.out.println("What do you want to do?");
				System.out.println("Enter 'a' to add a new car");
				System.out.println("Enter 'f' to fetch a cars details by its registration");
				System.out.println("Enter 'c' to change car color");
				System.out.println("Enter 'k' to update no. of kilometers");
				System.out.println("Enter 'q' to quit");
				c = sc.next().charAt(0);
				if (c == 'a') {
					String registration = getCarRegistration();
					System.out.println("Enter car make");
					String make = sc.next();
					System.out.println("Enter car model");
					String model = sc.next();
					System.out.println("Enter car color");
					String color = sc.next();
					
					
					Car car = new Car(registration, make, model, color);
					
					carDB.addCar(car);
					
					
					System.out.println("Car has been added");
					
					
					
				} else if (c == 'f') {
					String registration = getCarRegistration();
					Car car = carDB.findCarByReg(registration);
					
					if (car == null) {
						System.out.println("Car not found");
					} else {
						System.out.println(car.toString());
					}
					
					
					
					
					
					
				} else if (c == 'c') {
					String registration = getCarRegistration();
					Car car = carDB.findCarByReg(registration);
					
					
					if (car == null) {
						System.out.println("Car not found");
					}
					
					else {
						System.out.println("The car is currently " + car.getColor());
						System.out.println("Enter new color");
						String color = sc.next();
						
						System.out.println("Color for "+car.getRegistration()+" changed from"+
						car.getColor()+" to "+color);
						car.setColor(color);
					}
					
					
				} else if (c == 'k') {
					String registration = getCarRegistration();
					Car car = carDB.findCarByReg(registration);
					
					
					if (car == null) {
						System.out.println("Car not found");
					} 
					
					
					else {
						System.out.println("Enter no. of kilometers");
						int kilometers = sc.nextInt();
						if (car.getKilometers() < kilometers) {
							car.setKilometers(kilometers);
							System.out.println("Kilometers is now "+kilometers);
						} else {
							System.out.println("Sorry you put back the odometer");
						}
					}
					
					
				} else if (c == 'q') {
					System.out.println(Car.getNumberOfCars() + " cars have been created");
					System.out.println("Good bye!!");
					break;
					
				}
			}
		} catch (Exception e) {
			System.out.println("Exception in the input!");
			e.printStackTrace();
		}

	}

	private static String getCarRegistration() {
		System.out.println("Enter car registration");
		
		return sc.next();
	}
}

