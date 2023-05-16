package com.Lab;
import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
	int sum=0,carNo;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the car No is:");
	carNo=sc.nextInt();
	if(carNo<1000 || carNo>9999)
	{
		System.out.println("that number is  not valid car number"+carNo);
	}
	else
	{
		while(carNo!=0)
		{  
			int a=carNo%10;
			sum=sum+a;
			carNo=carNo/10;
			
		}
	
		if(sum%3==0 || sum%5==0 || sum%7==0)
		{
			System.out.println("this is  my lucky number");
		}
		
		else
		{
			System.out.println("sorry it is not my lucky number");
			
			}
		}
	}

}
