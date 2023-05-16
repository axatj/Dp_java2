//write a java program to check whether a number is negative,positive or zero
package com.practice;
import java.util.Scanner;
public class CheckPositivity {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    if(num>0)
    {
    	System.out.println("Numner is positive:");
    }
    else if(num<0)
    {
    	System.out.println("Number is negative:");
    }
    else
    {
    	System.out.println("Number is Zero:");
    }

	}

}
