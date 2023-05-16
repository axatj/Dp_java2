package com.loops;
import java.util.Scanner;
public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,first=1,second=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Terms:");
		num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
	  		first=first+second;
	  		System.out.print(first+" ");
	  		second++;
		}

	}

}
