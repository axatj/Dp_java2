package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class AveragePrime {

 	 
	public static void main(String[] args) {
     int a[]= new int[5];
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter an array");
     for(int i=0;i<a.length;i++)
     {
     a[i]=sc.nextInt();
     }
     int sum=0;
     int count=0;
     for(int num:a)
     {
    	 sum+=num;
    	 count++;
     }
 int avg=sum/a.length;
 System.out.println(Arrays.toString(a));
 System.out.println("Average is="+avg);
	}
public static boolean isPrime(int num)
{
	boolean checkprime=true;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			checkprime=false;
			break;
		}
	}
	return checkprime;
	}
}
