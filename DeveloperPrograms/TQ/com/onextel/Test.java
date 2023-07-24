package com.onextel;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int num1=1;
	int num2=2;
	for(int i=1;i<=n;i=i+2)
	{
		System.out.println(num1+" ");
		System.out.println(num2+" ");
		num1=num2-num1;
		num2=num1+num2;

		
	}

	}

}
