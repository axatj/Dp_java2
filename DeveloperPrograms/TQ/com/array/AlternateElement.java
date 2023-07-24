package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateElement {

	public static void alternateEle(int a[]) {
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.println(a[i]);
				sum = sum + a[i];
			}

		}
		System.out.print(sum);

	}

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the elements of array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		AlternateElement.alternateEle(a);
	}

}
