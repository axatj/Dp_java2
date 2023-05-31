package com.string;

import java.util.Scanner;

public class NoOfVowel {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a String");
  String s=sc.nextLine();
  
  int count=0;
  for(int i=0;i<s.length();i++)
  {
	  char ch=s.charAt(i);
  if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' ||ch=='u')
  {
	  count++;
  }
  
  }
  System.out.println("count no of vowels"+count);   
 }
}
