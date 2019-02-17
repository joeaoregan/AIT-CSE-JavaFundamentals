package ait.java.wk3.solutions;

import java.util.Scanner;

public class IfExercises {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//ifMonth();
		//iflargerOfTwoNumbers();
		//ifGrade();
		//ifTemperature();
		//ifLargest();
		ternaryOperator();
	}
	
	public static void ifMonth(){
		int month=0;
		final int JAN = 1, FEB = 2,MAR = 3,
		APR = 4,MAY = 5, JUN = 6,
		JUL = 7,AUG = 8,SEP = 9,
		OCT = 10,NOV = 11,DEC = 12;


        System.out.print("Enter month (1-12): ");
        try{
	        month = sc.nextInt();
	        if(month == JAN){
	        	System.out.println("January");
	        }else if(month == FEB){
	        	System.out.println("February");
	        }else if(month == MAR){
	        	System.out.println("March");
	        }else if(month == APR){
	        	System.out.println("April");
	        }else if(month == MAY){
	        	System.out.println("May");
	        }else if(month == JUN){
	        	System.out.println("June");
	        }else if(month == JUL){
	        	System.out.println("July");
	        }else if(month == AUG){
	        	System.out.println("August");
	        }else if(month == SEP){
	        	System.out.println("September");
	        }else if(month == OCT){
	        	System.out.println("October");
	        }else if(month == NOV){
	        	System.out.println("November");
	        }else if(month == DEC){
	        	System.out.println("December");
	        }else{
	        	System.out.println("Entry is out of range: "+month);
	        }
        }catch(Exception e){
        	System.out.println("Exception!");
        	e.printStackTrace();
        }
        
//        try{
        	//some piece of code
//        }catch(Exception e){
        	// execute this when we get an exception
//        }
        	

	}	
	public static void iflargerOfTwoNumbers(){		
		int x=0, y=0;
		try{
			// code to be protected
	        System.out.print("Enter first number : "); x = sc.nextInt();
	        System.out.print("Enter second number : "); y = sc.nextInt();
	        
	        if(x < 0 || y < 0){ // if either is negative, error
	        	System.out.println("Negative values are not allowed; "+ x + " "+y);
	        } else if (x >= 0 && y >= 0) { // both are positive
	        	// which of the two is the larger?
	        	if(x > y){
	            	System.out.println(x + " is > "+y);
	        	} else if (y > x){
	            	System.out.println(y + " is > "+x);
	        	} else{
	            	System.out.println(y + " == "+x);
	        	}
	        } 
		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}
		
	}
	public static void ifGrade(){
        int mark=0;
        System.out.print("Enter mark : ");
        try{
            mark = sc.nextInt();

            if(mark < 0 || mark > 100){
            	System.out.println("Error in input: "+mark+". Valid values are 0..100");
            }else{
                // valid mark value
                if(mark >= 70 && mark <= 100){
                	// mark >= 70 on its own works
                	System.out.println("A");
                } else if(mark >= 60 && mark <= 69){
                	// mark >= 60 on its own works
                    System.out.println("B");
                } else if(mark >= 50 && mark <= 59){
                    System.out.println("C");
                } else if(mark >= 40 && mark <= 49){
                    System.out.println("D");
                }else{
                    System.out.println("Fail");
                }
            }
        }catch(Exception e){
            System.out.println("Exception caught");
            e.printStackTrace();
        }
}
	public static void ifTemperature(){
		int temperature			= 0;
		final int VERY_COLD_MIN = -10;
		final int VERY_COLD_MAX =  2;
		final int COLD_MAX      =  9;
		final int MILD_MAX 		= 14;
		final int WARM_MAX 		= 20;
		final int VERY_WARM_MAX = 27;
		final int HOT_MAX		= 31;

        System.out.print("Enter temperature : ");
        try{
            temperature = sc.nextInt();
            if(temperature >= VERY_COLD_MIN && temperature <= VERY_COLD_MAX){  // -10 to +2
            	System.out.println("Very Cold");
            }
            else if (temperature > VERY_COLD_MAX && temperature <= COLD_MAX){ // 3..9
            	System.out.println("Cold");
            }
            else if (temperature > COLD_MAX && temperature <= MILD_MAX){ // 10..14 
            	System.out.println("Mild");
            }
            else if (temperature > MILD_MAX && temperature <= WARM_MAX){ // 15..20 
            	System.out.println("Warm");
            }
            else if (temperature > WARM_MAX && temperature <= VERY_WARM_MAX){ // 21..27 
            	System.out.println("Very warm");
            }
            else if (temperature > VERY_WARM_MAX && temperature <= HOT_MAX){ // 2    8..31 
            	System.out.println("Hot");        
            }
            else{
            	System.out.println("Extreme Temperature!");        
            }
        } catch(Exception e){
        	System.out.println("Exception caught...");
        }		
	}
	public static void ifLargest(){
		try{
			int num1=0, num2=0, num3=0;
	        System.out.print("Enter first number : ");
	        num1 = sc.nextInt();
	        System.out.print("Enter second number : ");
	        num2 = sc.nextInt();
	        System.out.print("Enter third number : ");
	        num3 = sc.nextInt();
	        int largest=0;
	        if (num1 >= num2){
	        	largest=num1;
	        }
	        if (num3>largest){
	        	largest=num3;
	        }
	        System.out.println("Largest Number is "+largest);
		}catch(Exception e){
        	System.out.println("Exception caught...");
        	e.printStackTrace();
		}
	}
	
	public static void ternaryOperator(){
        boolean isHappy=true;
        String mood = isHappy ? "I’m Happy!" : "I’m Sad!";
        System.out.println(mood);		

        int x=0, y=0, minVal=0;
        System.out.print("Enter x : ");
        x = sc.nextInt();
        System.out.print("Enter y : ");
        y = sc.nextInt();

        minVal = x < y ? x : y; 
        System.out.println("minVal == "+minVal);
		
	}


}
