package com.test;
import java.util.Scanner;

public class Divisiblity1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int num;
    for(num =1;num<=100;num++)
    {
    	if(num%5!=0 || num%10!=0)
    	{
    		System.out.println(num);
    	}
    }

	}

}
