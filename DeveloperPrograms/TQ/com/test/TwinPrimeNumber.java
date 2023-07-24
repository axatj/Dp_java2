package com.test;
import java.util.Scanner;
public class TwinPrimeNumber {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number:");
	int num1=sc.nextInt();
	System.out.println("Enter Second Number:");
	int num2=sc.nextInt();
	if(num1%2==0 && num2%2==0 || num1-num2==2 )
	{
		System.out.println("Twin number");
	}
	else 
	{
		System.out.println("Not a Twin Number:");
	}
}
}