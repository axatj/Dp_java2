//no of pizza 100/pizza and 20/puffs and 10/colddrinks
package com.Lab;
import java.util.Scanner;
public class TestCode1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. of pizzas bought:");
    int pi=sc.nextInt();
    System.out.println("Enter no. of puffs bought:");
    int pu=sc.nextInt();
    System.out.println("Enter no. of cold drinks bought:");
    int co=sc.nextInt();
    int totalprice;
    
    pi=pi*100;
    pu=pu*20;
    co=co*10;
    char ch;
    System.out.println("Bill details:");
    do {
    	
   System.out.println("no of pizza"+pi);
    System.out.println("No of puffs"+pu);
    System.out.println("no of colddrinks"+co);
    System.out.println("Do You want to continue");
    totalprice=pi+pu+co;
    System.out.println(totalprice);
    
    ch=sc.next().charAt(0);
    }while(ch=='y' || ch=='Y'); 
    
	}

}
