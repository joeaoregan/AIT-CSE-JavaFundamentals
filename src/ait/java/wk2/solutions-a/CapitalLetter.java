package ait.java.wk2.solutions-a;

import java.util.Scanner;

public class CapitalLetter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a letter (a-zA-Z): ");
		char c = sc.next().charAt(0);
		while(c != ';'){
			if(Character.isLowerCase(c)){
				System.out.println("Lowercase : "+c);
				System.out.println("The ASCII value of "+c+" is "+(int)c);				
			}else if(Character.isUpperCase(c)){
				System.out.println("Uppercase : "+c);
				System.out.println("The ASCII value of "+c+" is "+(int)c);				
			}else{ // error
				System.out.println("Error in input: "+c);
			}
			
			System.out.print("Enter a letter (a-zA-Z): ");
			c = sc.next().charAt(0);
		}

	}
}
