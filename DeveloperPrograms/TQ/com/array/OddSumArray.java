package com.array;

import java.util.Scanner;

public class OddSumArray {

	public static void OddSumArray(int a[]) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				sum = sum + a[i];

			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		OddSumArray.OddSumArray(arr);
	}

}
