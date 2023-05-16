//write a java Program to check whether a year is leap year or not
package com.practice;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Year:");
   int year=sc.nextInt();
   if(year%4==0 && year%100!=0 ||year%400==0)
   {
	   System.out.println("Its a Leap Year:");
   }
   else 
   {
	   System.out.println("It is not a leap year:");
	   
   }
		  

	}

}
