//accept number from user and check number is pallindrome number or not
//when user negative number then stop
package com.loops;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    
	System.out.println("Enter a number:");
	int num=sc.nextInt();
    int digit=0,total=0,original=num;
    while(num>0) {
	while(num!=0)
	{
		
		digit=num%10;
		total=total*10+digit;
		num=num/10;
	}
	
	System.out.println(total);
	
	
	
	if(total==original)
	 {
		 System.out.println(total+"It is pallindrome");
	 }
	 else
	 {
		 System.out.println(total+"It not a pallindrome");
	 }
	System.out.println("Enter a number:");
	num=sc.nextInt();
	
   }
	}

}
