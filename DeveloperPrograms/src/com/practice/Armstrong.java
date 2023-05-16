package com.practice;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	while(num>0)
	{
		int digit=num%10;
		sum=sum+(digit*digit*digit);
		num=num/10;
	}
	System.out.print(sum);
	num=temp;
	if(sum==num)
	{
		System.out.println("num is armstrong:");
	}
	else
	{
		System.out.println("Not:");
	}

	}

}
