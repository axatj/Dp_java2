package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {

	public void search(int a[], int n) {
		boolean ispresent = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				ispresent = true;
				break;
			}
		}
		if (ispresent) {
			System.out.println("Element present:");
		} else {
			System.out.println("Element not present:");
		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 7, 3, 4, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the element for search");
		int num = sc.nextInt();

		SearchElement s = new SearchElement();
		s.search(a, num);
	}
}
