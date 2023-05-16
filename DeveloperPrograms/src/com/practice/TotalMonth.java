//write a java program total number of days in a month
package com.practice;
import java.util.Scanner;
public class TotalMonth {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter month:");
	int month,days=0,year;
    month=sc.nextInt();
	if(month<=12 && month>=1)
	{
		System.out.println("Enter a Year:");
		year=sc.nextInt();
		if(month==1 || month==3 || month==5 || month==7|| month==8 || month==10)
		{
			days=31;
		}
		else if(month==4 || month==6 || month==9 || month==11)
		{
			days=30;
		}
		else if(month==2 && year%4==0 && year%100!=0 ||year%400==0)
		{
			days=29;
		}
		else
		{
			days=28;
		}
	}
	
	System.out.println("Number of days"+days);
	}

}
