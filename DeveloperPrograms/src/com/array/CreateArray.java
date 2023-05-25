package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {
		int arr[]= {7,4,5,4,2};
		//or
		int a[]=new int [5];
	//	a[0]=3;
		//a[1]=5;
	//	a[3]=6;
		//a[4]=6;
		//a[5]=4;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(a);
		System.out.println("-------");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("---------");
		for(int x:a)
		{
			System.out.println(x);
		}
		System.out.println("--------------");
		System.out.println(Arrays.toString(a));
		// TODO Auto-generated method stub

	}

}

