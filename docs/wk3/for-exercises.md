## Lec04- for exercises

1. Create a new class called ForLoops

2. In a method called forHeaderTesting(), code four for loops as follows:  
    a. Omit the loop termination condition from the for header[for(int i=0;;i++)]. Inside the loop, ask the user for a number; keep a running total of the numbers entered; -1 exits (use break to exit the loop as you would a switch statement). Output the total after the loop terminates.

    > Enter a number (-1 to end) --> 3  
    > Enter a number (-1 to end) --> 4  
    > Enter a number (-1 to end) --> 5  
    > Enter a number (-1 to end) --> -1  
    > Sum is 12

    b. Omit the loop initialisation section from the for header. Loop for a constant NUM_INPUTS which is set to 3. Ask the user for a number; keep a running total of the numbers entered and output the total after the loop terminates.

    ```java
    int j=1;
    for(;j<=NUM_INPUTS;j++) {
    ```

    > Enter a number --> 3  
    > Enter a number --> 4  
    > Enter a number --> 5  
    > sum is 12

    c. Omit the loop increment section. Logic is as in part (b) above.
    
    ```java
    for(int k=1;k<=NUM_INPUTS;) {
    ```
    
    > Enter a number --> 5  
    > Enter a number --> 6  
    > Enter a number --> 7  
    > sum is 18

    d. Leave out all three section of the header (note that the semi-colons are required otherwise you get a compiler error). Logic is similar to part (a) above.
 
    ```java
    for(;;) {
    ```
    
    > Enter a number (-1 to end) --> 3  
    > Enter a number (-1 to end) --> 4  
    > Enter a number (-1 to end) --> 5  
    > Enter a number (-1 to end) --> -1  
    > Sum is 12

3. Write a method called forSmallestLargest(). Ask the user for n which will determine the number of numbers in the sequence. Using a for loop, figure out the largest and smallest numbers in the sequence. Cater for negative numbers i.e. if all the numbers are negative, 0 should not be the largest. Also, if the user types in a negative number or 0 for n, use an if statement when outputting at the end to show that n was invalid.
 
    > Enter a number --> 2  
    > Enter a number --> 3  
    > Enter a number --> 4  
    > Enter a number --> 5  
    > The smallest number entered is: 1  
    > The largest number entered is: 5

    > Enter n --> 4  
    > Enter a number --> -3  
    > Enter a number --> -4  
    > Enter a number --> 5  
    > Enter a number --> 3  
    > The smallest number entered is: -4  
    > The largest number entered is: 5

    > Enter n --> -3  
    > n was invalid: -3  

4. In a method called forHistogram(), ask the user for the number of rows, number of columns and the character to output. Using for loops, output a histogram e.g. if rows is 3, columns is 4 and the character is “=”, then output:  

    ```text
        ====
        ====
        ====
    ```

    ```text
    Enter number of rows --> 5  
    Enter number of rows --> 6
    Enter the character to use --> *
    ******
    ******
    ******
    ******
    ******
    ```
5. Write a method called forAverage(). Ask the user for n which will determine the number of numbers in the sequence. Using a for loop, ask the user for a number; keep a running total of these numbers. When the loop terminates, calculate the average (double type).

    > How many values --> 4  
    > Enter a value --> 2  
    > Enter a value --> 3  
    > Enter a value --> 2  
    > Enter a value --> 3  
    > The average is 2.5

6. In a method called forSequence(), code a for loop, output the following sequence of numbers (with comma separators):  
                      1,4,9,16,25,36,49,64,81,100

    > 1,4,9,16,25,36,49,64,81,100

7. In a method called forSumEvenNumbers(), ask the user to input two even numbers, namely  from and to. Using a for loop, calculate the sum of the even numbers between from and to but not including from and to e.g. if 2 and 10 are entered, the total = 4+6+8 = 18. Note: for this exercise, if the user enters odd values for from or to, display an error.

    > From --> 2  
    > To --> 12  
    > The total is 28

    > From --> 1  
    > To --> 10  
    > Odd input: 1; 10  
    > The total is 0

    > From --> 2  
    > To --> 9  
    > Odd input: 2; 9  
    > The total is 0
8. In a method called twelveDaysOfChristmas(), using a for loop and two inner switch statements, output the following:

    ```text
    On the first day of Christmas,  
    My true love sent to me:  
        A partridge in a pear tree.


    On the second day of Christmas,
    My true love sent to me:
        Two turtle doves, and
        A partridge in a pear tree.


    On the third day of Christmas,
    My true love sent to me:
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.


    On the fourth day of Christmas,
    My true love sent to me:
        Four calling birds,
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.


    On the fifth day of Christmas,
    My true love sent to me:
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.


    On the sixth day of Christmas,
    My true love sent to me:
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.


    On the seventh day of Christmas,
    My true love sent to me:
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.


    On the eighth day of Christmas,
    My true love sent to me:
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.


    On the ninth day of Christmas,
    My true love sent to me:
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.


    On the tenth day of Christmas,
    My true love sent to me:
        Ten lords a-leaping,
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.


    On the eleventh day of Christmas,
    My true love sent to me:
        Eleven pipers piping,
        Ten lords a-leaping,
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.


    On the twelfth day of Christmas,
    My true love sent to me:
        Twelve drummers drumming,
        Eleven pipers piping,
        Ten lords a-leaping,
        Nine ladies dancing,
        Eight maids a-milking,
        Seven swans a-swimming,
        Six geese a-laying,
        Five golden rings,
        Four calling birds,
        Three French hens,
        Two turtle doves, and
        A partridge in a pear tree.
    ```

```bash
On the first day of Christmas,  
My true love sent to me:  
    A partridge in a pear tree.


On the second day of Christmas,
My true love sent to me:
	Two turtle doves, and
	A partridge in a pear tree.


On the third day of Christmas,
My true love sent to me:
```

---

[ForLoops.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk3/ForLoops.java)