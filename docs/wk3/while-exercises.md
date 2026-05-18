## Lec4 - while loop exercises

Create a new class called WhileLoops

1. In a method called thirdOrderPolynomial(), calculate the third order polynomial of x (the formula is fx = ax3 + bx2 + cx + d. Get the coefficients (a,b,c and d) from the user. Inside a while loop, ask the user for x. Calculate the fx value and output the result. Ask the user if he/she wished to continue. Note: all types are double.

> Enter coefficient a : 1.2  
> Enter coefficient b : 3  
> Enter coefficient c : 2.1  
> Enter coefficient d : 3  
> Enter the value for x: 1  
> The value of the polynomial at 1.0 is 9.3  
> Do you wish to continue (y/n) --> y  
> Enter the value for x: 2  
> The value of the polynomial at 2.0 is 28.8  
> Do you with to continue (y/n) -->

2. In a method called whileAverage(), calculate the average of n numbers where n is based on user input i.e. ask the user for the number of numbers in the sequence. Using a while loop, loop for that number of iterations n; in each iteration, get in a number num from the user. Keep a running total. When the loop is finished, calculate the average without losing decimal places.

> How many numbers in the sequence  --> 5  
> Please enter a number  --> 2  
> Please enter a number  --> 3  
> Please enter a number  --> 4  
> Please enter a number  --> 5  
> Please enter a number  --> 6  
> Average is 4.0

3. In a method called whileGrades(), code a while loop that asks the user for a grade (a-f). Use the toLowerCase() method to deal with lowercase letters only. Count up the number of A’s, B’s, C’s, D’s, E’s and F’s entered. “x” or “X” exits the loop. After the loop exits, output the count of each grade.

> Enter the grade a-f or A-F (x/X to exit) --> a  
> Enter the grade a-f or A-F (x/X to exit) --> b  
> Enter the grade a-f or A-F (x/X to exit) --> B  
> Enter the grade a-f or A-F (x/X to exit) --> c  
> Enter the grade a-f or A-F (x/X to exit) --> C  
> Enter the grade a-f or A-F (x/X to exit) --> C  
> Enter the grade a-f or A-F (x/X to exit) --> deEf  
> Letter entered was not in range !deef  
> Enter the grade a-f or A-F (x/X to exit) --> d  
> Enter the grade a-f or A-F (x/X to exit) --> e  
> Enter the grade a-f or A-F (x/X to exit) --> E  
> Enter the grade a-f or A-F (x/X to exit) --> f  
> Enter the grade a-f or A-F (x/X to exit) --> x  
> Number of A's is  1  
> Number of B's is  2  
> Number of C's is  3  
> Number of D's is  1  
> Number of E's is  2  
> Number of F's is  1  

4. In a method called whileHistogram(), ask the user for the number of rows and columns. Using while loops, output a histogram i.e. if rows is 3 and columns is 4, then output 3 rows, each row containing 4 stars each.

```text
Enter number of rows --> 3  
Enter number of cols --> 4  
****  
****  
****  
```
```text
Enter number of rows --> 5  
Enter number of cols --> 6  
******  
******  
******  
******  
******  
```

5. Write a method called whileLargestSmallest(). Ask the user for n which will determine the number of numbers in the sequence. Using a while loop, figure out the largest and smallest numbers in the sequence. Cater for negative numbers i.e. if all the numbers are negative, 0 should not be the largest. Also, if the user types in a negative number for n, use an if statement when outputting at the end to show that n was negative.

> Enter n --> 5  
> Enter a number --> 1  
> Enter a number --> 2  
> Enter a number --> 3  
> Enter a number --> 4  
> Enter a number --> 5  
> Largest is 5  
> Smallest is 1

> Enter n --> 5  
> Enter a number --> -4  
> Enter a number --> -2  
> Enter a number --> 0  
> Enter a number --> 3  
> Enter a number --> 6  
> Largest is 6  
> Smallest is -4

> Enter n --> -3  
> n was invalid: -3

> Enter n --> 1  
> Enter a number --> 5  
> Largest is 5  
> Smallest is 5

6. Write a method called whileSales(). Take in a sales amount; while the sales amount is not -1  execute a loop that calculates the monthly salary of the salesperson based on the following formula: 3000 + 9% of the sales amount entered; output the monthly salary and loop for the next sales amount. Continue the loop until -1 is entered.

> Enter sales (-1 to end) --> 1000  
> Salary is 3090.0 Euro

> Enter sales (-1 to end) --> 4000  
> Salary is 3360.0 Euro

> Enter sales (-1 to end) --> -1

7. Write a while loop that loops from 1 to 5. In the loop, calculate the square of the loop control variable and keep a running total of the squares. Insert the code into a method called whileSquares().

> 1  
> 4  
> 9  
> 16  
> 25  
> Total is 55

8. Calculate the average of a sequence of numbers (-1 ends the sequence). Ensure that -1 is not included in your calculation and also detect if no valid numbers are entered at all. Insert the code into a method called whileAverageSentinel() and invoke the method from main().

> Please enter a number (-1 to exit) --> 1  
> Please enter a number (-1 to exit) --> 2  
> Please enter a number (-1 to exit) --> 3  
> Please enter a number (-1 to exit) --> 4  
> Please enter a number (-1 to exit) --> 5  
> Please enter a number (-1 to exit) --> -1  
> Average is 3.0

> Please enter a number (-1 to exit) --> -1  
> No numbers entered...

---

[WhileLoops.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk3/WhileLoops.java)