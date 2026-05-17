## Assessment #2 (loops) – wk6

### Instructions

Time Allowed: 1hr 40 mins

Upload your AssessmentTwo.java file to moodle. Make sure that the code you submit compiles. Code containing compilation errors may attract zero marks.  
NB:- Make sure you upload the correct files. No need for error checking on input values.

#### 1. Create Package

Make a new package called `com.ait.assessment`.
    - ▾ 📂 src
      - ▾ 📦 com.ait.assessment
        - > 📄 AssessmentTwo.java
#### 2. Download Start File

Download the start file **AssessmentTwo.java** from moodle.

#### 3. Create Methods

Complete the following methods in the code.

   a. `multiplicationTableFor`. This method accepts no arguments and returns nothing. Using a Scanner object `sc` (which is declared as static inside the class, but outside of all of the methods, including multiplicationTableFor), take in a value of type `int` from the user. Use a `for` loop to output a multiplication table for the value entered as shown. Call the method from `main()`

```
<terminated> AssessmentTwo [Java Application] C:\Java\jdk
Display the multiplication table for ?
5
5 X 1  = 5
5 X 2  = 10
5 X 3  = 15
5 X 4  = 20
5 X 5  = 25
5 X 6  = 30
5 X 7  = 35
5 X 8  = 40
5 X 9  = 45
5 X 10 = 50
5 X 11 = 55
5 X 12 = 60
```

   b. `multiplicationTableWhile`. This method performs the exact same task as the previous method (`multiplicationTableFor`) except you should use a `while` loop instead of the `for` loop. Call the method from `main()`.

```
<terminated> AssessmentTwo [Java Application] C:\Java\jdk1.7.
Display the multiplication table for ?
8
8 X 1  = 8
8 X 2  = 16
8 X 3  = 24
8 X 4  = 32
8 X 5  = 40
8 X 6  = 48
8 X 7  = 56
8 X 8  = 64
8 X 9  = 72
8 X 10 = 80
8 X 11 = 88
8 X 12 = 96
```

   c. `oddNumbers`. This method prints all the odd numbers between a lower limit and an upper limit inclusive entered by the user. Use the `modulus` operator and the `"continue"` statement to skip the printing of even numbers. You may use your choice of `for` loop or a `while` loop.

```
<terminated> AssessmentTwo [Java Ap
Printing odd numbers
Enter lower limit
3
Enter upper limit
16
3 5 7 9 11 13 15
```

```
<terminated> AssessmentTwo [Java Application] C:\Java\jdk1.7.0_
Printing odd numbers
Enter lower limit
17
Enter upper limit
44
17 19 21 23 25 27 29 31 33 35 37 39 41 43
```

```
<terminated> AssessmentTwo
Printing odd numbers
Enter lower limit
3
Enter upper limit
13
3 5 7 9 11 13
```

   d. `doWhile`. This method prints the cube of a sequence of numbers between a lower and upper limit using a do while loop. The lower and upper limit are entered by the user.

```
<terminated> AssessmentTwo [Java App
Printing cube
Enter lower limit
2
Enter upper limit
7
Cube of 2 is 8
Cube of 3 is 27
Cube of 4 is 64
Cube of 5 is 125
Cube of 6 is 216
Cube of 7 is 343
```

```
<terminated> AssessmentTwo [Java A
Printing cube
Enter lower limit
12
Enter upper limit
16
Cube of 12 is 1728
Cube of 13 is 2197
Cube of 14 is 2744
Cube of 15 is 3375
Cube of 16 is 4096
```

   e. `lotteryOdds`. This method uses a for loop to calculate your probability of winning the lottery when numbers are chosen from a set and order doesn't matter. Suppose you choose two numbers from 1 to 5, then n=5 and k=2 in the formula below.

$$\frac{n \times (n-1) \times (n-2) \times \ldots \times (n-k+1)}{1 \times 2 \times 3 \times \ldots \times k}$$

   This method accepts no arguments and returns nothing. Using a Scanner object `sc` (which is declared as static inside the class, but outside all of the methods, including lotteryOdds), take in values for n and k of type int. You can use type double to store the odds. Call the method `lotteryOdds()` from `main()`.

```
<terminated> AssessmentTwo [Java Application] C:\Java\jdk1.7.0_79\bin\javaw.exe
Calculating Lottery Odds
how many numbers do you need to draw? -->
6
What is the highest number you can draw?-->
44
Your odds are 1 in 7059052.0 . Good luck!
```

```
<terminated> AssessmentTwo [Java Application] C:\Java\jdk1.7.0_79\bin\javaw
Calculating Lottery Odds
how many numbers do you need to draw? -->
2
What is the highest number you can draw?-->
5
Your odds are 1 in 10.0 . Good luck!
```