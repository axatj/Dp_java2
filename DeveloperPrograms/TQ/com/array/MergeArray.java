package com.array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter first array");
	int n1=sc.nextInt();
    System.out.println("Enter second array");
    int n2=sc.nextInt();
     
    int n3=n1+n2;
    
    int []A=new int[n1];
    int []B=new int [n2];
    int []C=new int [n3];
 System.out.print("Enter First array"+n1+"values");
	for(int i=0;i<A.length;i++)
	{
		A[i]=sc.nextInt();
	}
	System.out.print("Enter Second array"+n2+"values");
	for(int i=0;i<B.length;i++)
	{
		B[i]=sc.nextInt();
	}
	for(int i=0;i<n1;i++)
	{
		C[i]=A[i];
	}
	for(int i=0;i<n2;i++)
	{
		C[n1+i]=B[i];
	}
	System.out.println("Merge array is");
	for(int i=0;i<C.length;i++)
	{
		//System.out.print(C[i]+" ");
		
	}
	System.out.println(Arrays.toString(C));
}
}