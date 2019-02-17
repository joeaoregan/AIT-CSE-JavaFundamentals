package ait.java.wk1.solutions;
import java.util.Scanner;

public class AreaAndPerimeterApp {
	public static void main(String[] args) {
		// display a welcome message
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println(); // print a blank line

		// create the Scanner object
		Scanner sc = new Scanner(System.in);
		// get input from the user
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter width:  ");
		double width = sc.nextDouble();

		// calculate the area and perimeter
		double area = length * width;
		double perimeter = 2 * length + 2 * width;

		// display the result
		System.out.println("Area:         " + area);
		System.out.println("Perimeter:    " + perimeter);
		sc.close();

	}
}

