package com.basics;
import java.util.Scanner;
public class AgeTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int your_age,Friend_age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age ");
your_age=sc.nextInt();
System.out.println("Enter your friend age");
Friend_age=sc.nextInt();
if(your_age>Friend_age)
{
	System.out.println("Hi");
	}
else if(your_age<Friend_age)
{
System.out.println("Hello");	
}
else {
	System.out.println("How are you");
}
	}

}
