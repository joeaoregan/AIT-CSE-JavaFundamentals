package com.ait.golf1;

import java.text.NumberFormat;
import java.util.Scanner;

public class GolfResort {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		final double SENIOR_FEE = 28.40;
		final double JUNIOR_FEE = 30.10;
		final double ADULT_FEE = 50.50;
		String category = "";
		boolean weekend = false;
		double fee = 0.0;
		String errorMsg = "";
		System.out.println("Welcome to AIT Golf Resort");
		System.out.println("Input your age -->");
		try {
			int age = sc.nextInt();
			System.out.println("How many hours are you booking for?? (Min 1, Max 4) -->");
			int numHours = sc.nextInt();
			System.out.println("What day of the week are you booking for?-->");
			String day = sc.next().toUpperCase();
			if (age < 10) {
				errorMsg = "You are too young to play golf";
			}
			if ((numHours < 1) || (numHours > 4)) {
				errorMsg = "Number of hours must be between 1 and 4";
			}
			switch (day) {
			case "SAT":
			case "SUN":
				weekend = true;
				break;
			case "MON":
			case "TUE":
			case "WED":
			case "THUR":
			case "FRI":
				break;
			default:
				errorMsg = "Invalid data entered for day of week";
			}
			if (errorMsg.equals("")) {
				if (age > 59) {
					fee = numHours * SENIOR_FEE;
					category = "Senior";
				} else if (age > 17) {
					fee = numHours * ADULT_FEE;
					category = "Adult";
				} else {
					fee = numHours * JUNIOR_FEE;
					category = "Junior";
				}
				if (weekend) {
					fee = fee - (fee * 0.1);
				}
				NumberFormat currency = NumberFormat.getCurrencyInstance(java.util.Locale.FRANCE);
				String message = "Category: " + category + "\n" + "Number of hours: " + numHours + "\n"
						+ "Day of week: " + day + "\n" + "Fee due: " + currency.format(fee);
				System.out.println(message);
			} else {
				System.out.println(errorMsg);
			}
		} catch (Exception e) {
			System.out.println("Error in input");
		}

	}

}
