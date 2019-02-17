package ait.java.wk2.solutions-b;

import java.util.Scanner;

public class Modulus {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=0, y=0;

		// Enter the first number
		System.out.print("Enter x: ");
		x=sc.nextInt();
	
		// Enter the second number
		System.out.print("Enter y: ");
		y=sc.nextInt();

		if(x % y == 0)
			System.out.println(x + " is a multiple of " + y);
		else
			System.out.println(x + " is not a multiple of " + y);

	}
}
