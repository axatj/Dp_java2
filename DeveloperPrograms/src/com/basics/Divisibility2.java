package com.basics;
import java.util.Scanner;
public class Divisibility2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num%5==0 || num%3==0)
		{
			System.out.println("ITs Divisible");
		}
		else 
		{
			System.out.println("Not Divisible");
		}
	}

}
