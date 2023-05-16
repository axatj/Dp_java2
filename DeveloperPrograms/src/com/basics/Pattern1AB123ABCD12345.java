package com.basics;
import java.util.Scanner;
public class Pattern1AB123ABCD12345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int i,c;
    char ch;
    for(i=1;i<=rows;i++)
    {
    	if(i==2 || i==4)
    	{
    		ch='A';
    		for(c=1;c<=i;c++,ch++)
    		{
    			
    			System.out.print(ch);
    		}}
    		else
    		{
    			for(c=1;c<=i;c++)
    			{
    				System.out.print(c);
    			}
    		}
    			System.out.println();
    		}
    	
    	}
    }
	


