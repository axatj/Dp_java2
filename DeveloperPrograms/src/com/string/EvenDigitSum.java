package com.string;

import java.util.Scanner;

public class EvenDigitSum {
	public static void Find_Even_Digit_Sum(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{ 
			if(s.charAt(i)%2==0)
			{
				System.out.println(s.charAt(i));
				sum=sum+Character.getNumericValue(s.charAt(i));
			}
			}
			
		}
		System.out.println("sum="+sum);
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a String");
		 String s=sc.next();
		 EvenDigitSum.Find_Even_Digit_Sum(s);
		 

	}

}
