package com.Lab;

import java.util.Scanner;

public class Booking {

	 	 
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Movie m=new Movie(1234,"Akshat",200);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Movie Name:");
		String name=sc.next();
		System.out.println("Enter coupon");
		int coupon=sc.nextInt();
		float price=m.getPrice();
		m.show_details();
		if(coupon==100)
		{
		 
		
		System.out.println("price ="+(price-price*0.15));	
		}
		else if(coupon==200)
		{
		System.out.println("price="+(price-price*0.1));
		}
		else
		{
		System.out.println("no discount");	
		}
		 System.out.println("Enjoy the Show:");
			}

		}
		
