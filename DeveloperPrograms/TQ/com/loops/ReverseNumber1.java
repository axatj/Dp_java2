package com.loops;
import java.util.Scanner;
public class ReverseNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        int reversenum=0;
        while(num>0)
        {
        	int digit=num%10;
        	reversenum=reversenum*10+digit;
        	num=num/10;
        	
        }
        System.out.println(reversenum);
        

	}

}
