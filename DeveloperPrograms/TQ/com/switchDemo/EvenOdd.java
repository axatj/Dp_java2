package com.switchDemo;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=0;
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
    num=sc.nextInt();
  
   switch(num%2)
   {
   case 0:System.out.println(num+"this is an Even number");
   break;
   default:System.out.println(num+"this is an odd number");
   
   }
   
	}

}
