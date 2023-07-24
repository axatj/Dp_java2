//wap to print even number from 121 to 229 using for loop

package com.practice;
import java.util.*;
public class EvenNumbers1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter starting value");
    int st=sc.nextInt();
    System.out.println("Enter final value");
    int fi=sc.nextInt();
	for(int i=st;i<=fi;i++)
	{
		if(i%2==0)
		{
			System.out.println("List of even number" +i);
		}
	}
     
    
    }

	}


