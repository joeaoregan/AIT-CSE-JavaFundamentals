## Lec04 - switch exercises

Create a new class called SwitchExercises

1. Create a method called switchOnAString(). In the method, read in a name from the user. Using a switch construct, determine if the name entered is “john” or “mary”. If “john”, output “Male”, if “mary” output “Female”. Call the method from main().  
    a. expand to include “JOHN”, “John”, “MARY” and “Mary”.

> Enter a name : john  
> Male

> Enter a name : mary  
> Female

> Enter a name : JOHN  
> Male

2. Create a method called switchMonth(). In the method, read in a month number from the user. Using an switch construct, output the text for that month e.g. 1 is January etc.. Call the method from main().  
    a. Change the application to use constants.

> Enter a month : 1  
> January

> Enter a month : 5  
> May

> Enter a month : 12  
> December

> Enter a month : 20  
> Invalid month 20

3. Create a method called switchChar(). In the method, read in two numbers of type double (num1 and num2) and a character (operation). Using a switch construct, perform the mathematical operation identified by operation e.g. if ‘+’ add num1 and num2. Output the result (there should be only one output statement (which is after the switch statement)).

> Enter number1 : 3  
> Enter number2 : 4  
> Enter a char : +  
> 3.0+4.0=7.0

> Enter number1 : 5  
> Enter number2 : 4  
> Enter a char : *  
> 5.0*4.0=20.0

> Enter number1 : 10  
> Enter number2 : 4  
> Enter a char : -  
> 10.0-4.0=6.0

> Enter number1 : 15  
> Enter number2 : 3  
> Enter a char : /  
> 15.0/3.0=5.0

> Enter number1 : 4  
> Enter number2 : 5  
> Enter a char : @  
> Invalid mathematical operator @

4. Create a method called switchSquareOrCube(). In the method, read in a number n within the range 1..10. Using a switch construct, if the number is even (case 0:), output the square of n; if the number is odd (case 1:), output the cube of n.
 
> Enter a number (1..10) : 4  
> 4 squared is 16.0

> Enter a char : e  
> e is a vowel

> Enter a number (1..10) : 5  
> 5 cubed is 125

> Enter a number (1..10) : 11  
> 11 outside range of 1..10

5. Create a method called switchVowelOrConsonant(). Take in a letter from the user and using a switch statement, determine if the letter is a vowel or a consonant. Ensure that your switch statement only has case statements for lowercase letters and that the default section is for consonants only.

> Enter a char : e  
> e is a vowel

> Enter a char : f  
> f is a consonant

> Enter a char : @  
> @ is invalid input

6. Create a method called switchDaysInMonth(). In the method, ask the user for a year and a month. Using a switch statement calculate the number of days in the month and output the result. Note: the year input by the user is needed to calculate if February occurs on a leap year (Google the leap year logic).
 
> Enter year : 2018  
> Enter month (1..12) : 2  
> Number of days : 28

> Enter year : 2016  
> Enter month (1..12) : 2  
> Number of days : 29

> Enter year : 2017  
> Enter month (1..12) : 12  
> Number of days : 31

> Enter year : 1996  
> Enter month (1..12) : 6  
> Number of days : 30

---

[SwitchExercises](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk3/SwitchExercises.java)