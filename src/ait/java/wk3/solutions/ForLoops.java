package ait.java.wk3.solutions;

import java.util.Scanner;

public class ForLoops {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);//class scope 

	public static void main(String[] args) {
		//forHeaderTesting();
		//forSmallestLargest();
		//forHistogram();
		forAverage();
		//forSequence();
		//forSumEvenNumbers();
		//12DaysOfChristmas(); // compiler error
		//twelveDaysOfChristmas();
	}
	public static void forHeaderTesting(){
		final int NUM_INPUTS=3;
		int sum=0, input=0;

		// Leave out expression 2 in "for" header
		// => an infinite loop, as there is no checking for when to end
		//    we must break the loop ourselves
	/*	for(int i=0;;i++){
			System.out.print("Enter a number (-1 to end) --> ");
			input = sc.nextInt();
			if(input == -1)
				break;	// exit the loop
			else
				sum += input;
		}
		System.out.println("Sum is " + sum);*/

		// Leave out expression 1 in "for" header
		// => we must initialise the loop control variable j
		//    ourselves before the loop header
/*		sum=0;	// reset sum back to 0
		int j=1;
		for(;j<=NUM_INPUTS;j++){
			System.out.print("Enter a number --> ");
			input = sc.nextInt();
			sum += input;
		}
		System.out.println("Sum is " + sum);

		// Leave out expression 3 in "for" header
		// => we must increment/decrement the loop control 
		//    variable k inside the loop 
		sum=0;	// reset sum back to 0
		for(int k=1;k<=NUM_INPUTS;){
			System.out.print("Enter a number --> ");
			input = sc.nextInt();
			sum += input;
			k++;
		}
		System.out.println("Sum is " + sum);*/

		// Leave out all 3 expressions in "for" header
		// => an infinite loop, as there is no checking when to end
		//    the loop, we must break out of the loop ourselves
		sum=0;	// reset sum back to 0
		for(;;){	// () and 2 semi-colons required
			System.out.print("Enter a number (-1 to end) --> ");
			input = sc.nextInt();
			if(input == -1)
				break;	// exit the loop
			else
				sum += input;
		}
		System.out.println("Sum is " + sum);
	}
		public static void forSmallestLargest(){
	   		int n=0, number=0, smallest=0, largest=0;

	   		System.out.print("Enter n --> ");
	   		n = sc.nextInt();

	   		for(int i=1; i<=n; i++){
	   			System.out.print("Enter a number --> ");
	   			number = sc.nextInt();
	   	   		// The very first number is assumed initially to be the smallest if not and I entered all
	   			// positive numbers, 0 would be (incorrectly) the smallest (as it is initialised to 0 at the start).
	 		   if(i == 1){ // first number
				   largest=number;
				   smallest=number;
			   }else if ( number > largest ){
			       largest = number;
			   }else if ( number < smallest ){
				   smallest = number;
		        }
	   		}
	   		if(n>0){ // some number has been entered
	   			System.out.println("The smallest number entered is: " + smallest);
	   	   		System.out.println("The largest number entered is: " + largest);
	   		}else
	   			   System.out.println("n was invalid: "+ n);
		}
		public static void forHistogram(){
			int rows=0, cols=0;

			System.out.print("Enter number of rows --> "); 		rows = sc.nextInt();
			System.out.print("Enter number of rows --> "); 		cols = sc.nextInt();
			System.out.print("Enter the character to use --> ");
			char c = sc.next().charAt(0);

			for (int i=1; i<=rows; i++){
				for(int j=1; j<=cols; j++){
					System.out.print(c);
				}
				System.out.println();	// goto next line
			}		
		}
		public static void forAverage(){
			// Declare variables
			double total=0, average=0;
			int n=0;
			
			// Get the number of values from the user
			System.out.print("How many values --> ");
			n = sc.nextInt();

			for(int i=1; i<=n; i++) {
				System.out.print("Enter a value --> ");			
				total += sc.nextDouble();
			}
			
			// Now calculate the mean and standard deviation
			average = total/n;

			// Display results
			System.out.println("The average is "+average);
			
		}
	

	public static void forSequence(){
		// Using a "for" loop, output the following sequence:
		//		1,4,9,16,25,36,49,64,81,100
		for(int i=1; i<=10;i++) {
			if(i==10)
				System.out.println(i*i);
			else
				System.out.print(i*i + ",");
		}
		
	}
	
	
	public static void forSumEvenNumbers(){
		//	Sum the even numbers BETWEEN two user inputted numbers 
		//  (this calculation does NOT include the two numbers entered)
		int from=0, to=0, total=0;
		
		System.out.print("From --> ");
		from = sc.nextInt();
		System.out.print("To --> ");
		to = sc.nextInt();
		
		if(from%2 == 1 || to%2==1){
			System.out.println("Odd input: "+ from + "; "+to);
		}else{
			for(int i=from+2; i<to; i+=2)
				total+=i;
		}	
		System.out.println("The total is "+total);	
		
}
	
	public static void twelveDaysOfChristmas(){
	   for ( int day = 1; day <= 12; day++ ) {
System.out.print("On the ");
		switch ( day ) {       // switch for current day
	       	case 1: System.out.print("first");break;
	         	case 2: System.out.print("second");break;
	         	case 3: System.out.print("third");break;
	         	case 4: System.out.print("fourth");break;
	         	case 5: System.out.print("fifth");break;
	     		case 6: System.out.print("sixth");break;
	     		case 7: System.out.print("seventh");break;
	     		case 8: System.out.print("eighth");break;
	     		case 9: System.out.print("ninth");break;
	     		case 10:System.out.print("tenth");break;
   	  		case 11:System.out.print("eleventh");break;
     	 		case 12:System.out.print("twelfth");break;
      	}
      	System.out.println(" day of Christmas,\nMy true love sent to me:");

      	// NOTE: no "break" statements, hence descending numbers 
      	switch ( day ) {     
     			case 12:System.out.println ( "\tTwelve drummers drumming,");
     			case 11:System.out.println ( "\tEleven pipers piping,");
     			case 10:System.out.println ( "\tTen lords a-leaping,");
     			case 9: System.out.println ( "\tNine ladies dancing,");
     			case 8: System.out.println ( "\tEight maids a-milking,");
     			case 7: System.out.println ( "\tSeven swans a-swimming,");
     			case 6: System.out.println ( "\tSix geese a-laying,");
     			case 5: System.out.println ( "\tFive golden rings,");
     			case 4: System.out.println ( "\tFour calling birds,");
     			case 3: System.out.println ( "\tThree French hens,");
     			case 2: System.out.println ( "\tTwo turtle doves, and");
     			case 1: System.out.println ( "\tA partridge in a pear tree.\n\n");
      		} // switch	
	   }// for
	}// method
}// class


