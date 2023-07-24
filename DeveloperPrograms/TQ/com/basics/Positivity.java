package com.basics;
import java.util.Scanner;
public class Positivity {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a Number :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Number is Positive");
		}
		else if(num<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is Zero");
		}
		

	}

}
