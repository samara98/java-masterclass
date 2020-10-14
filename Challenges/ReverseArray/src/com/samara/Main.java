package com.samara;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {1, 5, 3, 7, 11, 9, 15};

		System.out.println("Array = " + Arrays.toString(array));

		reverse(array);

		System.out.println("Reversed array = " + Arrays.toString(array));
	}

	public static void reverse(int[] array) {
		int arrLen = array.length;
		for (int i = 0; i < arrLen / 2; i++) {
			int temp = array[i];
			array[i] = array[arrLen - 1 - i];
			array[arrLen - 1 - i] = temp;
		}
	}
}
