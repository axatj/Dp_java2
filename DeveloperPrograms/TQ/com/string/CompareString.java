package com.string;

public class CompareString {

	public static void main(String[] args) {
		
		String str="Hello";
		String str1="hello";
		String str2=new String("Hello");
		String str3=new String("Hello");

	System.out.println(str.equals(str2));
	System.out.println(str.equalsIgnoreCase(str2));
	
	//compareTo // o str==str1,   +ve str>str1,    -vestr<str1
	
	System.out.println(str.compareTo(str1));
	
	}

}
