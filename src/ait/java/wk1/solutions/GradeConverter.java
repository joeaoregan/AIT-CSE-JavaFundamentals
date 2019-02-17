package ait.java.wk1.solutions;
import java.util.Scanner;

public class GradeConverter {
	public static void main(String[] args) {
		// display a welcome message
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println(); // print a blank line

		// create the Scanner object
		Scanner sc = new Scanner(System.in);

		// perform conversions until choice isn't equal to "y" or "Y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get numerical grade from user
			System.out.print("Enter numerical grade: ");
			int numericalGrade = sc.nextInt();

			// convert numerical grade to letter grade
			if (numericalGrade > 100 || numericalGrade < 0) {
				// error part
				System.out.println("Error in grade input: " + numericalGrade);
			} else {
				// OK
				String letterGrade = "";
				if (numericalGrade >= 85) {
					letterGrade = "A";
				} else if (numericalGrade >= 70) {
					letterGrade = "B";
				} else if (numericalGrade >= 55) {
					letterGrade = "C";
				} else if (numericalGrade >= 40) {
					letterGrade = "D";
				} else {
					letterGrade = "Failed";
				}
				// display the result of the conversion
				System.out.println("Letter grade: " + letterGrade + "\n");
			}

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}
}


