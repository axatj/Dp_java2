package com.Lab;
import java.util.Scanner;
public class BookGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  BookGetterSetter BGS=new  BookGetterSetter();
  Scanner sc=new Scanner(System.in);
  
  BGS.setB_id(1234);
  BGS.setB_name("Akshat");
  BGS.setB_price(120);
  if(BGS.getB_name().equals("Akshat"))
  {
	BGS.getB_price();
  }
  System.out.println(BGS.getB_id()+" "+BGS.getB_name()+" "+BGS.getB_price());
	}

}
