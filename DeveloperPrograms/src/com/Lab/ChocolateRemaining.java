package com.Lab;
import java.util.Scanner;
public class ChocolateRemaining {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
System.out.println("Enter rupees:");
int ru=sc.nextInt();
int cnt=1;
int i=1;
while(i<=ru)
		{
	cnt++;
			if(i%3==0)
			{
	cnt++;			
			}	
			i++;
			
		}

		System.out.println("Number of chocoalte"+cnt);
		// TODO Auto-generated method stub

	}

}
