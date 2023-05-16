package com.Lab;
import java.util.Scanner;
public class Pattern2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,j,rows,k,space,num=1;
	System.out.println("Enter no.of rows\n");
	rows=sc.nextInt();
	space=rows-1;
	for(i=1;i<=2*rows-1;i++)
	{
		for(j=1;j<=space;j++)
		{
			System.out.println();
			
		}
		for(k=1;k<=num;k++)
		{
			System.out.print(k);
		}
		for(k=num;k>=1;k--)
		{
			System.out.print(k);
		}
		if(i<=rows-1)
		{
			num++;
			space--;
		}
		else
		{
			space++;
			num--;
		}
		System.out.print(" ");
	}
	
	}
}
