//write a java program to input any Character and check whether 
//it is a alphabhet,digit or special character
package com.practice;
import java.util.Scanner;
public class CheckAlphabet {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ALphabhet:");
	int ch=sc.next().charAt(0);
	if((ch>='a' && ch<='z') ||(ch>='A' &&ch>='Z'))
	{
		System.out.println("ITs a alphabet");
	}
	else if(ch>='0' && ch<='9')
	{
		System.out.println("Its a digit");
	}
	else {
		System.out.println("Its a speical character");
	}
	}

}
