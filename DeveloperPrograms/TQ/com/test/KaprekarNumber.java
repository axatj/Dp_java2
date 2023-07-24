package com.test;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int sq = num * num;
		int sum = 0;
		while (sq > 0) {
			int digit = sq % 100;
			sum = sum + digit;
			sq = sq / 100;

		}
		if (sum == num) {
			System.out.println("kaprekar");
		} else {
			System.out.println("Not kaprekar");
		}
	}

}
