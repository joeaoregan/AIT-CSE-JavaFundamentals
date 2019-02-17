package ait.java.wk1.solutions;
import java.util.Scanner;

public class InvoiceApplicationV1 {
	public static void main(String[] args) {
		// welcome the user to the program
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println(); // print a blank line
		double subtotal = 0;
		double discountPercent = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter subtotal:   ");
		subtotal = sc.nextDouble();
		System.out.print("Enter discount percent:   ");
		discountPercent = sc.nextDouble();
		double discountAmount = subtotal * discountPercent;
		double total = subtotal - discountAmount;
		// display the discount amount and total
		System.out.println("Subtotal:           " + subtotal);
		System.out.println("Discount percent:   " + discountPercent);
		System.out.println("Discount amount:    " + discountAmount);
		System.out.println("Total:              " + total);
	}
}
