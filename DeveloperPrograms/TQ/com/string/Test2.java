package com.string;

public class Test2 {

	public static void main(String[] args) {
		 String str1="Akshaewret";
		 String str2="Anamika";
		 
	  
	   System.out.println(str1.intern().equals(str2));
	   System.out.println(str1.codePointCount(1, 4));	 
		 

	}

}
