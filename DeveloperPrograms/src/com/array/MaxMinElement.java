package com.array;
import java.util.Scanner;
public class MaxMinElement {

	public static void findMax(char ch[]) {
		
		for(char c:ch) {
			System.out.println(c+" "+(int)(c));
		}
		char maxchar=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(maxchar<ch[i]) {
				maxchar=ch[i];
			}
			}
		System.out.println("maxelement ="+maxchar);
	}
	public static void finMin(char ch[]) {
		for(char c:ch)
		{
			System.out.println(c+" "+(int)(c));
		}
		char minchar=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(minchar>ch[i]) {
				minchar=ch[i];
			}
		}
		System.out.println("minelement="+minchar);
	}
	
public static void main(String[] args) {
	char ch[]=new char[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elments of array");
	for(int i=0;i<ch.length;i++)
	{
		ch[i]=sc.next().charAt(0);
	}
	MaxMinElement.findMax(ch);
	MaxMinElement.finMin(ch);
}
}
