## Lec04- if exercises

Create a new class called IfExercises. Each part below will be contained in a method.

1. Read in a month number from the user. Using an if construct, output the text for that month e.g. 1 is January etc.. Use constants and allow for entries which are out of range.  
    a. Put the code into a method called ifMonth() and call it from main().  
    b. Protect the if statement to cater for exceptions e.g. entering a letter instead of a number throws a InputMismatchException.

> Enter month (1-12): 6  
> June

> Enter month (1-12): 12  
> December

> Enter month (1-12): 13  
> Entry is out of range: 13

> Enter month (1-12): a  
> Exception!
> java.util.InputMismatchException...

2. Read in two integers from the user into variables x and y. If either value is negative, display an error showing the values. If both x and y are greater than 0 determine which of the two is the larger.  
    a. Cater for exceptions.  
    b. Insert the code into a method called iflargerOfTwoNumbers() and call from main().  

> Enter first number : 8  
> Enter second number : 3  
> 8 is > 3

> Enter first number: 2  
> Enter second number: 5  
> 5 is > 2

> Enter first number: w  
> Exception caught  
> java.util.InputMismatchException...

3. Read in a numeric mark (whole number) from the user. If mark is negative or greater than 100, flag an error showing the erroneous value. Determine the grade based on the following criteria: 70..100 is an A; 60..69 is a B; 50..59 is a C; 40..49 is a D; otherwise it’s a Fail.  
    a. insert the code into a method called ifGrade() and call from main().  
    b. Allow for Exceptions.

> Enter mark : 97  
> A

> Enter mark : 65  
> B

> Enter mark : 55  
> C

> Enter mark : 45  
> D

> Enter mark : 35  
> Fail

> Enter mark : 102  
> Error in input: 102. Valid values are 0..100

> Enter mark : t  
> Exception caught  
> java.util.InputMismatchException...

4. Get in a temperature from the user (whole number). The temperature is graded as follows:  
    a. -10 to +2 is “Very Cold”  
    b. 3 to 9 is “Cold”  
    c. 10 to 14 is “Mild”  
    d. 15 to 20 is “Warm”  
    e. 21 to 27 is “Very Warm”  
    f  28 to 31 is “Hot”  
    g. If the temperature is outside these ranges, output “Extreme temperature”. 

At all times, insert the temperature into your output message.  
Insert the code into a method called temperature() and call from main().  
Use constants and cater for Exceptions.

> Enter temperature : -8  
> Very Cold 

> Enter temperature : 4  
> Cold

> Enter temperature : 13  
> Mild

> Enter temperature : 16  
> Warm

> Enter temperature : 28  
> Hot

> Enter temperature : 30  
> Hot

> Enter temperature : 36  
> Extreme Temperature!

> Enter temperature : k  
> Exception caught...

5. Write a method called ifLargest() that takes in three whole numbers. Using the if construct (and no logical operators), determine the largest number entered. Assume unique numbers and cater for exceptions.

> Enter first number : 2  
> Enter second number : 3  
> Enter third number : 4  
> Largest Number is 4

> Enter first number : 2  
> Enter second number : v  
> Exception caught...  
> java.util.InputMismatchException...

6. Write a method called ternaryOperator(). In the method, set a Boolean variable isHappy to true and using the ternary operator, set a String variable named mood to “I am Happy” or “I am Sad” depending on isHappy. Expand the method to take in two integers x and y. Using the ternary operator, determine which of the two is the smallest.

> I'm Happy!  
> Enter x : 4  
> Enter y : 5  
> minVal == 4

---

[IfExercises.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk3/IfExercises.java)