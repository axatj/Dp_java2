//write code to  find a average of digit from the number
package com.loops;

import java.util.Scanner;

public class AverageDigit {

	public static void main(String[] args) {
		int count = 0, average;
		int digit, sumOfDigits = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digit :");
		digit = sc.nextInt();
		while (digit != 0) {
			sumOfDigits += digit % 10;
			digit = digit / 10;
			++count;
		}
		average = sumOfDigits / count;
		System.out.println("Average Digit:" + average);
		// TODO Auto-generated method stub
	}
}