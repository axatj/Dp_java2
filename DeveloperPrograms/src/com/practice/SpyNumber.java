package com.practice;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int product=1,sum=0,digit;
		while(num>0)
		{
		    digit=num%10;
			sum=sum+digit;
			product=product*digit;
		    num=num/10;
		}
		if(sum==product)
		{
			System.out.println("Number is spy number");
		}
		else
		{
			System.out.println("Not a spy Number");
		}
		
		 

	}

}
