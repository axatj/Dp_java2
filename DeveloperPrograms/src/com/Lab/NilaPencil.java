package com.Lab;
import java.util.Scanner;
public class NilaPencil {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter standard");
	int standard=sc.nextInt();
	int i=0,temp=0,square=0;
	if(standard>0 && standard<=12)
	{
		for(i=1;i<=standard;i++)
		{
			square=i*i;
			temp=temp+square;
		}
		System.out.println(temp);
		
	}
	else
	{
		System.out.println("Invalid output");
	}
	}

}
