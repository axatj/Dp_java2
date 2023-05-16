package com.basics;
import java.util.Scanner;
public class Divisbility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
if(num%5==0)
{
System.out.println("Divisible by 5");	
}
else
{
System.out.println("Not divisible");	
}
	}

}
