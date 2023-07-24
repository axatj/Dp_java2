package com.loops;
import java.util.Scanner;
public class DigitSum2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		  int num=sc.nextInt();
		  int firstdigit=0, lastdigit=0, sum;
		  lastdigit=num%10;
			 
		  while(num!=0)
		  {
		    	firstdigit=num%10;
				  num=num/10; 
		     
		  }
		  System.out.println("first digit is:"+firstdigit);
		  
		  System.out.println("last digit is:" +lastdigit);
		  sum = firstdigit + lastdigit;
		  System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
