package com.array;

import java.util.Scanner;

public class FindNumberOfHighest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int num1 = num / 100; // 123
		System.out.println("1." + num1);

		int num2 = num / 10;
		num2 = num2 % 1000;
		System.out.println("2." + num2);

		int num3 = num % 1000;

		System.out.println("3." + num3);

		int prod1 = 1;
		int prod2 = 1;
		int prod3 = 1;

		while (num1 > 0) {
			int rem = num1 % 10;
			prod1 = prod1 * rem;
			num1 = num1 / 10;
		}
		while (num2 > 0) {
			int rem = num2 % 10;
			prod2 = prod2 * rem;
			num2 = num2 / 10;

		}
		while (num3 > 0) {
			int rem = num3 % 10;
			prod3 = prod3 * rem;
			num3 = num3 / 10;
		}

		if ((prod1 > prod2) && (prod1 > prod3)) {
			System.out.println("prod1 is bigger" + prod1);
		} else if ((prod2 > prod3) && (prod2 > prod1)) {
			System.out.println("prod2 is bigger" + prod2);
		} else {
			System.out.println("prod3 is bigger" + prod3);
		}

	}
}