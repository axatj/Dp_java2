//write a java program to find maximum between three numbers
package com.practice;
import java.util.Scanner;
public class MaximumNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first number:");
	int num1=sc.nextInt();
	System.out.println("Enter a Second number:");
	int num2=sc.nextInt();
	System.out.println("Enter a third number:");
	int num3=sc.nextInt();
	if(num1>=num2 && num1>=3)
	{
		System.out.println("First number is Greater:"+num1);
	}
	if(num2>=num1 && num2>=num3)
	{
		System.out.println("Second number is Greater:"+num2);
	}
	else
	{
		System.out.println("Third number is Greater:"+num3);
	}
	

	}

}
