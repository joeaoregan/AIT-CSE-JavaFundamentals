package ait.java.wk3.solutions;

import java.util.Scanner;
public class SwitchExercises {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//switchOnAString();
		//switchMonth();
	//	switchChar();
		//switchSquareOrCube();
		//switchVowelOrConsonant();
		switchDaysInMonth();

	}

	public static void switchOnAString() {
		System.out.print("Enter a name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		// The default can appear anywhere; however it is good programming
		// practice to
		// put it at the end.
		switch (name) {
		// default:
		// System.out.println("??");
		// break;
		case "john":
		case "JOHN":
		case "John":
			System.out.println("Male");
			break;
		case "mary":
		case "MARY":
		case "Mary":
			System.out.println("Female");
			break;
		default:
			System.out.println("??");
			break;
		}
	}
	
	public static void switchMonth() {
		final int JAN=1,FEB=2,MAR=3,APR=4,MAY=5,JUN=6,
				JUL=7,AUG=8,SEPT=9,OCT=10,NOV=11,DEC=12;
		
		System.out.print("Enter a month : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch (month) {
			case JAN:
				System.out.println("January");
				break;
			case FEB:
				System.out.println("Febuary");
				break;
			case MAR:
				System.out.println("March");
				break;
			case APR:
				System.out.println("April");
				break;
			case MAY:
				System.out.println("May");
				break;
			case JUN:
				System.out.println("June");
				break;
			case JUL:
				System.out.println("July");
				break;
			case AUG:
				System.out.println("August");
				break;
			case SEPT:
				System.out.println("September");
				break;
			case OCT:
				System.out.println("October");
				break;
			case NOV:
				System.out.println("November");
				break;
			case DEC:
				System.out.println("December");
				break;
			default:
				System.out.println("Invalid month " + month);
				break;
		}
		
	}

	public static void switchChar() {
		double answer = 0, num1;
		boolean charOK = true;

		System.out.print("Enter number1 : ");
		num1 = sc.nextDouble();
		System.out.print("Enter number2 : ");
		double num2 = sc.nextDouble();

		System.out.print("Enter a char : ");
		char operation = sc.next().charAt(0);

		switch (operation) {
		case '+': // single quotes when its a char
			answer = num1 + num2;
			break;
		case '*':
			answer = num1 * num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case '/':
			answer = num1 / num2;
			break;
		default:
			System.out.println("Invalid mathematical operator " + operation);
			charOK = false;
			break;
		}
		if (charOK) {
			// System.out.println("The answer is "+answer);
			// Note: If I leave out the "" in the following S.o.println() I will
			// get the ASCII values
			// i.e. incorrect output!
			System.out.println(num1 + "" + operation + num2 + "=" + answer);
		}
	}
	public static void switchSquareOrCube() {
		try{
			System.out.print("Enter a number (1..10) : ");
			int n = sc.nextInt();
			if(n < 1 || n > 10){ // outside range
				System.out.println(n + " outside range of 1..10");				
			} else{
				// ok - in range 1..10
				switch(n%2){
					case 0: // even
						System.out.println(n + " squared is "+ Math.pow(n, 2));
						break;
					case 1: // odd
						System.out.println(n + " cubed is "+ (n*n*n));
						break;
					default:
						System.out.println("How did we get here!!!");
						break;
				}
			}
		}catch(Exception e){
			System.out.println("Exception in the input!");
			e.printStackTrace();
		}
	}
	
	public static void switchVowelOrConsonant() {
		System.out.print("Enter a char : ");
		char letter = sc.next().toLowerCase().charAt(0);
		// check if in range 'a' to 'z'
//		if((int)letter >= 97 && (int)letter <= 122){
		if(letter >= 'a' && letter <= 'z'){
			switch(letter){
				case 'a':case 'e':case 'i':case 'o':case 'u':
					System.out.println(letter + " is a vowel ");
					break;
				default: // consonant
					System.out.println(letter + " is a consonant ");
					break;
			}
		}else{
			System.out.println(letter + " is invalid input");
		}
	}
	public static void switchDaysInMonth() {
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		System.out.print("Enter month (1..12) : ");
		int month = sc.nextInt();
		
		final int JAN=1;final int FEB=2;final int MAR=3;
		final int APR=4;final int MAY=5;final int JUN=6;
		final int JUL=7;final int AUG=8;final int SEP=9;
		final int OCT=10;final int NOV=11;final int DEC=12;
		
		int numDays=0;
		
		switch(month){
			case JAN:case MAR:case MAY:case JUL:case AUG:
			case OCT:case DEC:
				numDays=31;
				break;
			case APR:case JUN:case SEP:case NOV:
				numDays=30;
				break;
			case FEB:
				if( (  (year % 4 == 0) && !(year % 100 == 0)   ) || 
						(year % 400 == 0)   ){
					// leap year
					numDays = 29;
				}else{
					numDays = 28;
				}
				break;
			default:
				System.out.println("Invalid month : "+month);
				break;
		}
		System.out.println("Number of days : "+numDays);
		
	}
	
	
	

	}

