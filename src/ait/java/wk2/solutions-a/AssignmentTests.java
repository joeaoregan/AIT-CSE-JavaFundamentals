package ait.java.wk2.solutions-a;

import java.util.Scanner;

public class AssignmentTests {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;

		Scanner sc = new Scanner(System.in);
		// prompt
		System.out.print("Enter integer (1..10) : ");
		x = sc.nextInt();
		if (x <= 0 || x > 10) {
			// flag an error
			System.out.println("Input value outside of range 1..10: " + x);
		} else if (x > 5) {
			System.out.println("The cube of " + x + " is " + Math.pow(x, 3));
			// System.out.println("Input value between 1..5: "+x);
			// int square = x * x;

		} else {
			double square = Math.pow(x, 2);
			System.out.println("The square of " + x + " is " + square);
		}
	}

}
