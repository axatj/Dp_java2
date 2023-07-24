//write code to create the addition of first digit and last digit
//from the number and input number from the user
package com.loops;
import java.util.Scanner;
public class DigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
	    int first_digit=0,last_digit=0,sum;
		last_digit=number%10;
		System.out.println("last digit is:"+last_digit);
 	    while(number!=0)
		{
			first_digit=number%10;
			number=number/10;
		}
	    System.out.println("first digit is :"+first_digit);
	    sum=first_digit+last_digit;
	    System.out.println(sum + "Digit sum is");
		

	}

}
