//write a java program to input any alphabet and check whether it is
//vowel or consonant
package com.practice;
import java.util.Scanner;
public class VowelConsonent {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any alphabet:");
    char ch=sc.next().charAt(0);
    if(ch=='a' || ch=='A')
    {
    	System.out.println("Its a vowel:");
    }
    else if(ch=='e' || ch=='E')
    {
    	System.out.println("Its  a Vowel:");
    }
    else if(ch=='i' || ch=='I')
    {
    	System.out.println("Its a vowel:");
    }
    else if(ch=='o' || ch=='O')
    {
    	System.out.println("Its a vowel:");
    }
    else if(ch=='u' || ch=='U')
    {
    	System.out.println("Its a vowel:");
    }
    else
    {
    	System.out.println("Its a consonant:");
    }
	}

}
