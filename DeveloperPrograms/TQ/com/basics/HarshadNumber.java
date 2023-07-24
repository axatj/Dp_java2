package com.basics;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem=0,sum=0;
		int temp=num;//stores a number
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(num%sum==0)
		{
		System.out.println("Number is Harshad");
		}
		 
	}

}
