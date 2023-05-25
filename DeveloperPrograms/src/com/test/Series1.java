package com.test;
import java.util.Scanner;
public class Series1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int range=sc.nextInt();
	int sum=0,add=1;
	System.out.print(sum+",");
	for(int i=0;i<range;i++)
	{
		add=add+2;
		sum=sum+add;
		System.out.print(sum+",");
	}
   
	}

}
