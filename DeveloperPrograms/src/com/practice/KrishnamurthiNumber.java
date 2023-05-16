package com.practice;

import java.util.Scanner;

public class KrishnamurthiNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	while(num!=0)
	{
		int digit=num%10;
		//factorial logic
		int fact=1;
		for(int i=1;i<=digit;i++)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
	}
	//end 
	if(sum==temp)
	{
		System.out.println("Num is krishnamurthi :"+sum);
	}
	else
	{
		System.out.println("Number is not Krishnamurthi :"+sum);
	}

	}

}
