package com.test;
import java.util.Scanner;
public class FactSum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int fact=1,sum=0;
	int n=sc.nextInt(); 
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
		sum=sum+fact;
		
	}
	System.out.println(sum);
	

	}

}
