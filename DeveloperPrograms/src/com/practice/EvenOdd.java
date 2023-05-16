//write a java program to check whether a number is even or odd
package com.practice;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println("Its Even:"+num);
	}
	else
	{
		System.out.println("Its odd:"+num);
	}
	}

}
