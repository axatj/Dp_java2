package com.practice;

import java.util.Scanner;

public class PrimeAverage {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int i=2,count=0,average=0;
    for(i=2;i<=num;i++) {
	while(i<num)
	 {if(num%i==0)
	 {
		 count=1;
		 break;
	 }
	 i++;
		
	}
	average=num/i;

	if(count==0)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("not prime");
	}
	System.out.println(average);
	
	}

	}  	 }
	



