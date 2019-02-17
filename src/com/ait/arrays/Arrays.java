package com.ait.arrays;

import java.util.Scanner;

public class Arrays {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exerciseA();
		//exerciseB();
		//histogram();
		//dynamicHistogram();
		//frequency();
		//multiDimArray();
		studentGrades();
	}
	public static void exerciseA() {
		int[] a = {10,20,30,40,50};
		for(int i=0; i<a.length; i++) {		// normal for loop
			System.out.println(a[i]);		// indexing required
		}
		for(int i : a) {					// enhanced for loop	
			System.out.println(i);			// no indexing required
		}				
	}
	public static void exerciseB() {
		int[] b = new int[5];
		for(int i=0; i<b.length; i++) {	
			System.out.print("Enter a value --> ");
			b[i] = sc.nextInt();
		}
		for(int i=0; i<b.length; i++) {		// normal for loop
			System.out.println(b[i]);		// indexing required
		}				
		for(int i : b) {					// enhanced for loop	
			System.out.println(i);			// no indexing required
		}				
	}
	
public static void histogram() {
		int[] n = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};

		System.out.println("Element\tValue\tHistogram");

		for (int i=0; i<n.length; i++){// loop for each element in array n
			System.out.print(i + "\t" + n[i] + "\t");
			for(int j=0; j<n[i]; j++)	// write out n[i] stars
				System.out.print("*");
			System.out.println();		// go onto next line
		}
		
	}
	public static void dynamicHistogram() {
		System.out.print("How many elements in array? ");
		int size = sc.nextInt();
		int[] n = new int[size];
		
		// Initialise array based on user values
		for (int i=0; i<n.length; i++){
			System.out.print("Please enter a value --> ");
			n[i] = sc.nextInt();
		}

		System.out.println("Element\tValue\tHistogram");

		for (int i=0; i<n.length; i++){	// loop through array n
			System.out.print(i + "\t" + n[i] + "\t"); 
			for(int j=0; j<n[i]; j++)	// output n[i] stars 
				System.out.print("*");
			System.out.println();		// go onto next line
		}
	}
	public static void frequency() {
		/*
		Notes
		 1. We are counting the frequency of the values 1..10 (no 0's)
		    Rather than using [0] to store the number of 1's we want to use [1] as
			  it is more logical. Thus we end up with :
					- frequency[0] is not used at all.
					- frequency[1] has the total number of 1's
					- frequency[2] has the total number of 2's
					...
					- frequency[10] has the total number of 10's
			  Thus the array must be 11 long (as it has an index of 10 and 0..10 is 11)

		
 
Rating  Frequency
		1       2
		2       2
		3       2
		4       1
		5       1
		6       3
		7       2
		8       4
		9       1
		10      2

		*/
		int responses[] = 
			{1,2,6,4,8,5,9,7,
			 8,10,1,6,3,8,6,10,
			 3,8,2,7};
		int frequency[] = {0,0,0,0,0,0,0,0,0,0,0};	// 11 entries

		for(int answer=0; answer < responses.length; answer++)
			frequency[responses[answer]]++;
		
		System.out.println("Rating\tFrequency");

		// Skipping frequency[0]
		// frequency is at the moment : [0,2,2,0,2,1,2,2,5,3,1]
		for(int rating=1; rating < frequency.length; rating++)
			System.out.println(rating + "\t" + frequency[rating]);
		
	}
	public static void multiDimArray() {
		int[][] array = { {1,2,3}, {4,5,6} };

		System.out.println("Values of array are : ");
		printTheArray(array); }
	public static void printTheArray(int a[][]) {
		for (int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
	public static void studentGrades() {
		/* Output is:
		The array is
		                [0]     [1]     [2]     [3]
		studentGrades[0] 77     68      86      73
		studentGrades[1] 96     87      89      78
		studentGrades[2] 70     90      86      81


		The lowest grade is 68
		The highest grade is 96
		The average for student 0 is 76.0
		The average for student 1 is 87.5
		The average for student 2 is 81.75
		*/		
		
		int studentGrades[][] =
			{	{77,68,86,73},
				{96,87,89,78},
				{70,90,86,81} };

		System.out.println("The array is ");
		
		printArray(studentGrades);

		System.out.println("\n\nThe lowest grade is " + minimum(studentGrades));
		System.out.println("The highest grade is " + maximum(studentGrades));

		// To get the average, pass in each row (an individual students grades)
		// i.e. studentGrades[0] refers to {77,68,86,73}
//		for(int person=0; person<studentGrades.length; person++){
//			System.out.println("The average for student " + person + " is " + 
//			  average(studentGrades[person]);	
//		}
		
int row=1;
		for(int[] student:studentGrades){
			switch(row){
				case 1:  	System.out.print("The average for the first student is ");
							break;
				case 2:  	System.out.print("The average for the second student is ");
							break;
				case 3:  	System.out.print("The average for the third student is ");
							break;
			}
			System.out.println(average(student));
			
			row++;
		}
	}
		
	// Find the minimum grade
	public static int minimum(int grades[][]) {
		int lowGrade = 100;

//		1. Using the normal for loop...
//		for (int student=0; student<grades.length; student++)
//			for (int grade=0; grade<grades[student].length; grade++)
//				if (grades[student][grade] < lowGrade)
//					lowGrade = grades[student][grade];

//		2. Using the enhanced for loop...
		for(int[] student:grades)
			for(int grade:student)
				if (grade < lowGrade)
					lowGrade = grade;
			
		return lowGrade;
	}
	

// Find the maximum grade
	public static int maximum(int grades[][]) {
		int maxGrade = 0;
//		1. Using the normal for loop...
//		for (int student=0; student<grades.length; student++)
//			for (int grade=0; grade<grades[student].length; grade++)
//				if (grades[student][grade] > maxGrade)
//					maxGrade = grades[student][grade];

//		2. Using the enhanced for loop...
		for(int[] student:grades)
			for(int grade:student)
				if (grade > maxGrade)
					maxGrade = grade;

		return maxGrade;
	}	
	public static void printArray(int grades[][]){
		System.out.println( "\t\t[0]\t[1]\t[2]\t[3]");
//		1. Using the normal for loop...
//		for (int student=0; student<grades.length; student++){
//			System.out.print ( "\nstudentGrades[" + student + "] ");
//			for (int grade=0; grade<grades[student].length; grade++)
//				System.out.print (grades[student][grade] + "\t");
//		}
		int row=0;
		for(int[] student:grades){
			System.out.print ( "\nstudentGrades[" + row + "] ");
			for(int grade:student)
				System.out.print (grade + "\t");
			row++;
		}
		System.out.println();
	}
	// Determine the average grade for a particular student
	//  The function "average" will receive in an array as a parameter. This array is 
	//	in fact one of the rows of a double-subscripted array (each row in a 
	//	double-subscripted array is itself a single-subscripted array)
	public static double average (int studentGrades[]){
		double total=0;

		for(int grade:studentGrades)
			total += grade;
		
		return total/studentGrades.length;
	}
}

