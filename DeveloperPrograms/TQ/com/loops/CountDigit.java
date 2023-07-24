//write code to count the number of digit from the number
package com.loops;
import java.util.Scanner;
public class CountDigit {

	public static void main(String[] args) {
		int count=0;
		int digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit :");
		digit=sc.nextInt();
		while(digit!=0)
		{
	digit=digit/10;
	++count;
		}
		System.out.println("Numbe of digit:" +count);
		
		// TODO Auto-generated method stub

	}

}
