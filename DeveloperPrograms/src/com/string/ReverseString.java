package com.string;

import java.util.Scanner;

public class ReverseString {
	
public void reverseString(String str) {
	System.out.println(str);
	String reverse="";
	for(int i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
	}
	System.out.println(reverse);
}
public void reverseWord(String str) {
	String st[]=str.split(" ");
	String reversevalue="";
	for(int i=0;i<st.length;i++) {
		String word=st[i];
        String revword="";
		for(int j=word.length()-1;j>=0;j--)
		{
		revword=revword+word.charAt(j);
		}
		reversevalue=reversevalue+" "+revword;
	}
	System.out.println(reversevalue);
	
}


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s=sc.nextLine();
	ReverseString rs=new ReverseString();
	rs.reverseString(s);
	rs.reverseWord(s);
	}

	
}
