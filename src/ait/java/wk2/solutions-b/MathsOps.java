package ait.java.wk2.solutions-b;

import java.util.Scanner;

public class MathsOps {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0, sum = 0, product = 0, difference = 0, quotient = 0;
		Scanner sc = new Scanner(System.in);

		// Enter the first number
		System.out.print("Enter num1: ");
		num1 = sc.nextInt();

		// Enter the second number
		System.out.print("Enter num2: ");
		num2 = sc.nextInt();

		// Sum
		sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

		// Product
		product = num1 * num2;
		System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

		// Difference
		difference = num1 - num2;
		System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);

		// Quotient
		if (num2 != 0) {
			quotient = num1 / num2;
			System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
		} else {
			System.out.println("num2 is 0; cannot divide by 0 : " + num2);
		}

	}
}
