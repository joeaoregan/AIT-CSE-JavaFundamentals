package com.ait.arrays;

import java.util.Arrays;


public class ArraysExercise2 {
	public static void main(String[] args) {
//		usingArraysClass();
		statistics();
		
	}
	public static void statistics() {
		// Part A
		// arr1 deliberately has an odd number of elements 

		int arr1[] = {9, 3, 44, 17, 15};
//		double sum=0; // easiest way for decimal points
		int sum=0;
		
		// average
		for(int value:arr1)
			sum+=value;
		System.out.println("The average is "+sum/(double)arr1.length); // implicit promotion
		
		// calculate the median value
		double median = calculateMedian(arr1);
		System.out.println("Median value is "+median);
		
		// calculate the range
		int range = calculateRange(arr1);
		System.out.println("range == "+range);
		
		// Part B
		// arr2 deliberately has an even number of elements 

		int arr2[] = {8, -6, 89, 17, 12, 6};
		double sum2=0; // easiest way for decimal points
		
		// average
		for(int value:arr2)
			sum2+=value;
		System.out.println("The average is "+sum2/arr2.length); 
		
		// calculate the median value
		median = calculateMedian(arr2);
		System.out.println("Median value is "+median);
		
		//System.out.println("The median value is : "+median);
	
		// calculate the range
		range = calculateRange(arr2);
		System.out.println("range == "+range);
	}
	
public static double calculateMedian(int []array) {
		// median where there are an odd number of elements 
		//   - sort the array and then get the middle element
		// median where there are an even number of elements 
		//   - sort the array 
		//   - add the two middle elements together and then divide by 2
		double median = 0;
		Arrays.sort(array);
		if(array.length % 2 == 1){ // odd number of elements
			int middleIndex = array.length/2; 
			median = array[middleIndex];
		}else{ // even number of elements in the array
			int middleIndex = array.length/2; 
			int sumOfTwoMiddleValues = 
					array[middleIndex]+
					array[middleIndex-1];
			median = sumOfTwoMiddleValues/2;
		}
		
		return median;
	}
	public static int calculateRange(int []array) {
		int lowestValue=0;
		int highestValue=0;
		
		// using normal for loop
		for(int i=0; i<array.length; i++){
			if(i==0){// first time round
				lowestValue = array[i];
				highestValue = array[i];
			}else{
				if(array[i] < lowestValue)
					lowestValue = array[i];
				if(array[i] > highestValue)
					highestValue = array[i];				
			}
		}
		
		lowestValue=Integer.MAX_VALUE;
		highestValue=Integer.MIN_VALUE;
		//System.out.println("lowestValue "+lowestValue);
		//System.out.println("highestValue "+highestValue);
		// using enhanced for loop
		for(int value:array){
			if(value < lowestValue)
				lowestValue = value;
			if(value > highestValue)
				highestValue = value;
		}
		return highestValue-lowestValue;
	}
	public static int calculateRangeV2(int []array) {
		Arrays.sort(array);
		return (array[array.length-1] - array[0]);
	}
	
	
public static void usingArraysClass() {
		double[] grades={92.3, 44.9, 76.9, 73.2};
		Arrays.sort(grades);
		for(double d:grades)
			System.out.println("grades == "+d);

		// copyOfRange(original, from, to) - to is exclusive
		// 2-0 size array created; copy indices [0] and [1] into low[0] and [1] respectively
		double[] low = Arrays.copyOfRange(grades, 0, 2);
		for(double d:low)
			System.out.println("low == "+d);
		// 5-2 size array created; copy indices [2], [3] into high[0] and [1] respectively; put 0 in high[2]
		double[] high = Arrays.copyOfRange(grades, 2, 5); 
		for(double d:high)
			System.out.println("high == "+d);
	}

}
