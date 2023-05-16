package com.basics;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		int num1;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		if(num1%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
