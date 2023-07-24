package com.array;

import java.util.Scanner;

public class Onextel2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want to print number");
		int find = sc.nextInt();
		int sum = 0;
		int flag = 0;
		int count = 0;
		for (int i = 2; i <= 200; i++) {
			
          boolean isPrime=true;			
			for (int j =2; j < i; j++) {
				if (i % j == 0) {
					isPrime=false;
					break;
			 	}
				 
			}
			
				if (isPrime) {
					if(count<find)
					{
						sum = sum + i;	
						count++;
						
					}
					
					System.out.println(i);
					
				}
			}
		
		System.out.println("sum of prime number :"+sum);
			
	}
		
	}


