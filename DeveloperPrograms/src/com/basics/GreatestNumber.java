package com.basics;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second,third;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first Number:");
		first=sc.nextInt();
		System.out.println("Enter the second number:");
		second=sc.nextInt();
		System.out.println("Enter the third Number:");
		third=sc.nextInt();
		
		//this example is ladder if
		if(first>=second && first>=third)
		{
			System.out.println(first + "first number is the largest number:");
		}
		else if(second>=first && second>=third)
		{
			System.out.println(second + "second number is the largest number:");
		}
		else 
		{
			System.out.println(third + "Third Number is the largest number:");
		}
		
	}

}
