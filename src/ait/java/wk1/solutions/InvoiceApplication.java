package ait.java.wk1.solutions;
import java.util.Scanner;

public class InvoiceApplication
{
    public static void main(String[] args)
    {
       
       
        double subtotal = 100;
        double discountPercent= 0.2;
        double discountAmount = subtotal * discountPercent;
        double total = subtotal - discountAmount;
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line   
            // display the discount amount and total
        System.out.println("Subtotal:           "+subtotal); 
        System.out.println("Discount percent:   "+discountPercent); 
        System.out.println("Discount amount:    "+discountAmount);
        System.out.println("Total:              "+total);
    }
}
