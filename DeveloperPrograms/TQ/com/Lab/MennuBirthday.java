package com.Lab;
import java.util.Scanner;
public class MennuBirthday {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter meenu age:");
    int age=sc.nextInt();
    if(age>0)
    {
    int coins=age*age*age;
    System.out.println("coins="+coins);
    
    }
    else
    {
    	System.out.println("invalid age");
    }
	}
	}
