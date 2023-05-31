package com.string;
import java.util.Scanner;
public class DigitSum {

public static void find_digitSum(String s) {
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		//if(s.charAt(i)>='0' && s.charAt(i)<='9')
//	{
		if(Character.isDigit(s.charAt(i))) {
		System.out.println(s.charAt(i)); 	
		sum=sum+Character.getNumericValue(s.charAt(i));  
	}
	
	}
	
	System.out.println("sum="+sum);
}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String s=sc.next();
    DigitSum.find_digitSum(s);
	}

}
