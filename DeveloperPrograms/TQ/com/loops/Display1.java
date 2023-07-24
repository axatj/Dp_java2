//write a code to display numbers between 1 to 15 if any number is divisible 
//by 3 and 5 skip that number

package com.loops;
import java.util.Scanner;
public class Display1 {

	public static void main(String[] args) {
		 for(int i=1;i<=15;i++)
		{
			if(i%3==0 || i%5==0)
			{
				 continue;
				
			}
			else 
			{
				System.out.println(i+ "print that number");
			}
			
		}
		
		// TODO Auto-generated method stub

	}

}
