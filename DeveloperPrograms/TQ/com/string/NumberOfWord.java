package com.string;

import java.util.Scanner;

public class NumberOfWord {

public static void find_numberOfWords(String s) {
	String st[]=s.split(" ");
    System.out.println(st.length);	 
	
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String s=sc.nextLine();
	NumberOfWord.find_numberOfWords(s);
	

	}

}
