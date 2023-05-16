package com.loops;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		int num,result,digit;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    num=sc.nextInt();
		int x=num; 
	    if(num<0)
	    {
		num=num*-1;
		}
	   result=0;
		while(num>0)
		{
			digit=num%10;
			result=(result*10)+digit;
			num=num/10;
			}
		if(x<0)
		{
			result=result*-1;
		}
		System.out.println(result +"result is");
		
		// TODO Auto-generated method stub

	}

}
