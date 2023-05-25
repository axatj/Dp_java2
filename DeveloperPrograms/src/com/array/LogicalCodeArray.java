package com.array;

import java.util.Scanner;

public class LogicalCodeArray {

	public static void findeven(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
		
		System.out.println("--------");
		for(int x:arr)
		{
			if(x%2==0)
			{
				System.out.println(x);
			}
			
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array elements");
	int []a=new int[5];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();

}
LogicalCodeArray.findeven(a);

	}

}
