package com.loops;
import java.util.Scanner;
public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    int temp=num; //to store in temp when the number remains same
    int reverse=0,rem;
    while(temp!=0)
    {
    	rem=temp%10;
    	reverse=reverse*10+rem;
    	temp=temp/10;
    }
    if(num==reverse)
    {
    	System.out.println(num + "Is a Pallindrome number");
    }
    else
    {
    	System.out.println(num + "Is not a Pallindrome number");
    }
	}

}
