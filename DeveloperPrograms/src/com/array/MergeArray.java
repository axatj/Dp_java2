package com.array;
import java.util.Scanner;

public class MergeArray {

	public void mergeArray(int c[])
	{
		int c[i]=new int[5];
		for(int i=0;i<c.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		System.out.println(c[i]);
	}
		
	
		
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter an array");
	int a[]= new int[5];
	int b[]= new int[5];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<b.length;i++)
{
	b[i]=sc.nextInt();
}
 
	
	
}}