package com.test;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter base:");
    int base=sc.nextInt();
    System.out.println("Enter Exponent:");
    int expo=sc.nextInt();
    int power=1;
    for(int i=1;i<=expo;i++)
    {
    	power=power*i;
    	
    }
    System.out.println(power);
		
	}

}
