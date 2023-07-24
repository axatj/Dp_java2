package com.test;
import java.util.Scanner;
public class FrequencyOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		long num=sc.nextLong();
		System.out.println("Enter your digit");
        int digit=sc.nextInt();
        long count=0,rem;
        long temp=num;
        do
        {
        	rem=temp%10;
        	if(rem==digit)
        	{
        		count++;
        	}
        	temp=temp/10;
        	
        }while(temp>0);
        System.out.println("Frequency of digit="+count);
	}

}
