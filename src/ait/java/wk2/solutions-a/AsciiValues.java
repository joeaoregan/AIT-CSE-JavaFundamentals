package ait.java.wk2.solutions-a;

import java.util.Scanner;

public class AsciiValues {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter char : ");
		char c = sc.next().charAt(0);
		while (c != 'x')
		{
			// the next line just prints out the char e.g. a or b
//			System.out.println("Ascii value of "+ c +" is "+c); 
			System.out.println("Ascii value of "+ c +" is "+(int)c);

			// the next line just prints out the ascii value of the char e.g. 97 or 98
			System.out.print("Enter char : ");
			c = sc.next().charAt(0);
		}

	}
}
