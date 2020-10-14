package com.samara;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Create a program using arrays that sorts a list of integers in descending order.
		// Descending order is highest value to lowest.
		// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
		// ultimately have an array with 106,81,26, 15, 5 in it.
		// Set up the program so that the numbers to sort are read in from the keyboard.
		// Implement the following methods - getIntegers, printArray, and sortIntegers
		// getIntegers returns an array of entered integers from keyboard
		// printArray prints out the contents of the array
		// and sortIntegers should sort the array and return a new array containing the sorted numbers
		// you will have to figure out how to copy the array elements from the passed array into a new
		// array and sort them and return the new sorted array.

		int[] myIntegers = getIntegers(5);
		int[] sorted = sortIntegers(myIntegers);
		printArray(myIntegers);
		printArray(sorted);
	}

	public static int[] getIntegers(int capacity) {
		int[] result = new int[capacity];
		System.out.println("Enter " + capacity + " integer values:\r");
		for (int i = 0; i < result.length; i++) {
			result[i] = scanner.nextInt();
		}
		return result;
	}

	public static void printArray(int[] array) {
		int i = 0;
		for (int item : array) {
			System.out.println("Element " + i + " contents " + item);
			i++;
		}
	}

	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = Arrays.copyOf(array, array.length); // copying without referencing
		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = i + 1; j < sortedArray.length; j++) {
				if (sortedArray[i] > sortedArray[j]) {
					int temp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}
		return sortedArray;
	}
}
