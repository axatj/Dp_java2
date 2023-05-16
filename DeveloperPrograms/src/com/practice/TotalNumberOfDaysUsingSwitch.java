//write a java program print total number of days in a month
//using switch case

package com.practice;
import java.util.Scanner;
public class TotalNumberOfDaysUsingSwitch {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter month:");
    int month=sc.nextInt();
    if(month>=12 && month<=1)
    {
    System.out.println("Enter year:");
    int year=sc.nextInt();
    }
    System.out.println("Enter choice:");
    int choice=sc.nextInt();
    System.out.println("1.Jan\n2.feb\n3.march\n4.april\n5.may\n6.june\n7.july\n8.aug\n9.sep\n10.oct\n11.nov\n12.dec");
    switch(choice)
    {
    case 1:System.out.println("31 days");
    break;
    case 3:System.out.println("31 days");
    break;
    case 5:System.out.println("31 days");
    break;
    case 7:System.out.println("31 days");
    break;
    case 8:System.out.println("31 days");
    break;
    case 10:System.out.println("31 days");
    break;
    case 12:System.out.println("31 days");
    break;
    case 4:System.out.println("30 days");
    break;
    case 6:System.out.println("30 days");
    break;
    case 9:System.out.println("30 days");
    break;
    case 11:System.out.println("30 days");
    break;
    case 2:
    default:System.out.println("Invalid output");
    	 
    }
	}

}
