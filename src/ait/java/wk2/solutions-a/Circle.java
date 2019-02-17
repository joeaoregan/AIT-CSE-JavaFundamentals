package ait.java.wk2.solutions-a;

import java.util.Scanner;

public class Circle {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius=0, diameter=0, circumference=0, area=0;
		final double PI=3.14; // a constant (could use Math.PI)
		
		// get the radius from the user
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();
		
		//PI=3.14; // get an error
		
		// calculate the diameter
		diameter = radius * 2;
		System.out.println("The diameter is "+diameter);
		
		// calculate the circumference
		circumference = PI * diameter;
		System.out.println("The circumference is "+circumference);

		// calculate the area
//		area = PI * (radius * radius);
		area = PI * Math.pow(radius, 2);
		System.out.println("The area is "+area);
	}

}
