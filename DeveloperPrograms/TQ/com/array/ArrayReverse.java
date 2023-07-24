package com.array;

import java.util.Arrays;

public class ArrayReverse {
//print array in reverse
	public static void printReverse(int a[]) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
//reverse an array

	public static void reverseArray(int a[]) {
		int j = a.length - 1;
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}

	}

	public static void main(String[] args) {
		int a[] = { 5, 8, 3, 2, 8 };
		System.out.println(Arrays.toString(a));
		ArrayReverse.printReverse(a);

		System.out.println(Arrays.toString(a));
		ArrayReverse.reverseArray(a);
		System.out.println(Arrays.toString(a));

	}
}