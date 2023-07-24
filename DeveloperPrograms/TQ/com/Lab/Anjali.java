package com.Lab;

import java.util.Scanner;

public class Anjali {
	public static void main(String[] args) {
	int a[]= {23,56,45,78,99};
	int n=a.length;
	int temp;
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n/2;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		for(int j=n/2;j<n-1;j++)
		{
			if(a[j]<a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}				
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]+" ");
	}
	}
}