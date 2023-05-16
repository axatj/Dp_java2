package com.Lab;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    for(int i=1;i<=4;i++)
    {
    	for(int j=1;j<=4-i;j++)
    	{
    		System.out.print(" ");
    	}
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(j);
    	}
    	for(int j=i;j>=1;j--) {
    		System.out.print(j);
    	}
    	System.out.println();
    }
	}
}
