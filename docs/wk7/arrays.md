
Write a program called Arrays that contains a main method.

1. Write a method called exercise() that declares and initialises an array as follows:

`int[] a = {10,20,30,40,50};`

Use a normal look and an enhanced for loop to iterate through the array and print out the values.

```
10
20
30
40
50
10
20
30
40
50
```

2. Write a method called exercise(), that declares an array of type in and length of 5. Take in 5 ints from the user and store them in the array. Again use both a normal loop and an ehnhanced for loop to output the values.

```
Enter a value --> 2
Enter a value --> 3
Enter a value --> 5
Enter a value --> 7
Enter a value --> 2
2
3
5
7
2
2
3
5
7
2
```

3. Write a method called histogram(), which initialises an array as follows: 

```java
static void histogram() {
    int[] n = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};
}
```

Iterate through the array and output the element number, the value of that element followed by the equivalent number of stars (*).

```
Element Value  Histogram
0       19     *******************
1       3      ***
2       15     ***************
3       7      *******
4       11     ***********
5       9      *********
6       13     *************
7       5      *****
8       17     *****************
9       1      *
```

4. Write a method called dynamicHistogram() that does the same as 3, except that the number of elements in the array and the values are taken as input from the user.

```
How many elements in array? 5
Please enter a value --> 12
Please enter a value --> 4
Please enter a value --> 8
Please enter a value --> 13
Please enter a value --> 5
Element Value   Histogram
0       12      ************
1       4       ****
2       8       ********
3       13      *************
4       5       *****
```

5. Write a method called frequency() that counts the frequency of the number 1-10 in and array.

```java
int responses[] =
    {1,2,6,4,8,5,9,7
     8,10,1,6,3,8,6,10,
     3,8,2,7}
int frequency[] = {0,0,0,0,0,0,0,0,0,0,0} // 11 entries
```

Use normal for loops to get the frequency values an output them.

```
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
```

6. Write a method called multiDimArray() that initialises a 2 dimensional array and prints out the values.

```java
int[][] array = {{1,2,3}, {4,5,6}};
```

```
Values of array are :
1 2 3
4 5 6
```

7. Write a method called studentGrades() that initialise a 2-D array with grades for three students.

```java
int studentGrades[][] = 
    { {77,68,86,73},
      {96,87,89,78},
      {70,90,86,81} };
```

Output the lowest grade, the highest grade and the average for each student.

```
The array is 
                [0]     [1]     [2]     [3]
studentGrades[0] 77     68      86      73
studentGrades[0] 96     87      89      78
studentGrades[0] 70     90      86      81

The lowest grade is 68
The highest grade is 96
The average for the first student is 76.0
The average for the second student is 87.5
The average for the third student is 81.75
```

---

[Arrays.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk7/Arrays.java)  