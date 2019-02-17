package ait.java.wk2.solutions-b;

import java.util.Scanner;

public class IfLogicalOps {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Get in values from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();

		// compare
		if (num1 < 0 && num2 < 0) {
			System.out.println("Both numbers are negative");
		} else if (num1 > 0 && num2 > 0) {
			System.out.println("Both numbers are positive");
		} else if (num1 == 0 || num2 == 0) {
			System.out.println("One of the numbers is 0");
		} else if (num1 < 0 || num2 < 0) {
			System.out.println("One of the numbers is negative");
		}
	}

}
