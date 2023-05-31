package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

public boolean Check_Anagram(String str1,String str2)
{
boolean isanagram=false;
if(str1.length()==str2.length())
{
	String st1=str1.toLowerCase();
	String st2=str2.toLowerCase();
	System.out.println(" "+str1+" "+str2);
	
	
	char ch1[]=st1.toCharArray();
	char ch2[]=st2.toCharArray();
	
	
	System.out.println(Arrays.toString(ch1));
	System.out.println(Arrays.toString(ch2));
	
	//sort logic
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	System.out.println("After sort------------");
	System.out.println(Arrays.toString(ch1));
	System.out.println(Arrays.toString(ch2));
	
	String s1=new String(ch1);
	String s2=new String(ch2);
	
	
	if(s1.equals(s2))
	{
		isanagram=true;
	}
	else
	{
		isanagram=false;
	}
}
return isanagram;		
}
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first string");
     String str1=sc.nextLine();
     System.out.println("Enter second String"	);
     String str2=sc.nextLine();
	 CheckAnagram ca=new CheckAnagram();
	 if(ca.Check_Anagram(str1, str2))
	 {
		 System.out.println("Anagram");
	 }
	 else
	 {
		 System.out.println("Not");
	 }
	}

}
