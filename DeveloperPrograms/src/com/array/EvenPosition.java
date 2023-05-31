package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenPosition {
public static void evenP(int n[])
{
	for(int i=0;i<n.length;i++)
	{
		 
		if(i%2==0)
		{ 
			
	
	System.out.println(n[i]);
		}
		
		
	}
}
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elements of array");
	
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
	 a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	EvenPosition.evenP(a);
	
	}

}
