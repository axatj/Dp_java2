package com.string;

import java.util.Scanner;

public class PatternString {

public void Patter_String(String str)
{
	String st[]=str.split(" ");
	
for(int i=0;i<=st.length-1;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print(st[j]+" ");
	}
	System.out.println();
	}
	
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.nextLine();
	PatternString ps=new PatternString();
	ps.Patter_String(s);

}

}
