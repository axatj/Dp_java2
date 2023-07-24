package com.test;
import java.util.Scanner;
public class TrimorphicNumber {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    int cube=num*num*num;
 while(num!=0)
 {
	 if(num%10!=cube%10)
	 {
		 System.out.println("Not a trimorphic Nunber");
		 break;
	 }
	 num=num/10;
	 cube=cube/10;
 }
 if(num==0)
 {
	 System.out.println("Number is trimorphic number");
 }
	}

}
