package com.string;

import java.util.Scanner;

public class NumberOfCharacter {
public static void find_character(String s) {
	int count=0;
	for(int i=0;i<s.length();i++) {
		if((s.charAt(i)<='a' && s.charAt(i)>='A') || (s.charAt(i)<='z' && s.charAt(i)>='Z'))
		{
			count++;
		}
		
	}
	System.out.println(count);
}
	
	
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a string");
   String s=sc.next();

   NumberOfCharacter.find_character(s);
	}

}
