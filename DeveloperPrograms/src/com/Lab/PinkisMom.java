package com.Lab;
import java.util.Scanner;
public class PinkisMom {

	public static void main(String[] args) {
		//take one number from user and find out the
		//occurance of each digit of number

		   Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num=sc.nextInt();
		 System.out.println("Enter digit");
		 int digit=sc.nextInt();
		 int count=0,rem,temp=num;
		 do
		 {
			 rem=temp%10;
			 if(rem==digit)
			 {
				 count++;
			 }
			 temp=temp/10;
			 
		 }while(temp>0);
		   System.out.println(digit+"appears "+count+ "times in" +num);
		  }
			

	}


