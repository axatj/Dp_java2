package com.Lab;
import java.util.Scanner;
public class Factors {

	public void findFactors(int num)
	{
	int sum=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			System.out.println(i);
		}
	}
	}
		public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
System.out.println("ENter the number:");
int num=sc.nextInt();
Factors fc=new Factors();
fc.findFactors(num);
	}

}
