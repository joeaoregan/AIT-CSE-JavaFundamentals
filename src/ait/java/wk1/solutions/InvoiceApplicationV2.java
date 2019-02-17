package ait.java.wk1.solutions;
import java.util.Scanner;

public class InvoiceApplicationV2 {
	public static void main(String[] args) {
		// welcome the user to the program
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println(); // print a blank line

		int invoiceCount = 0, discountCount = 0;
		double invoiceTotal = 0.0, discountTotal = 0.0;
		// create a Scanner object named sc
		Scanner sc = new Scanner(System.in);

		// perform invoice calculations until choice isn't equal to "y" or "Y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the invoice subtotal from the user
			System.out.print("Enter subtotal:   ");
			double subtotal = sc.nextDouble();

			// calculate the discount amount and total
			double discountPercent = 0.0;
			if (subtotal >= 500) {
				discountPercent = .25;
				discountCount = discountCount + 1;
			} else if (subtotal >= 200) {
				discountPercent = .2;
				discountCount = discountCount + 1;
			} else if (subtotal >= 100) {
				discountPercent = .1;
				discountCount = discountCount + 1;
			}
			double discountAmount = subtotal * discountPercent;
			double total = subtotal - discountAmount;

			// for the average...
			invoiceCount = invoiceCount + 1;
			discountTotal = discountTotal + discountAmount;
			invoiceTotal = invoiceTotal + total;

			// display the discount amount and total
			String message = "Discount percent: " + discountPercent + "\n" + "Discount amount:  " + discountAmount
					+ "\n" + "Invoice total:    " + total + "\n";
			System.out.println(message);

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		String message = "Number of invoices: " + invoiceCount + "\n" + "Average invoice: "
				+ invoiceTotal / invoiceCount + "\n" + "Average discount: " + discountTotal / discountCount + "\n";
		System.out.println(message);
	}
}
