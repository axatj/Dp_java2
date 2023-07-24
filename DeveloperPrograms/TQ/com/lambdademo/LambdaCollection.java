package com.lambdademo;
import java.util.*;
public class LambdaCollection {

	public static void main(String[] args) {
   ArrayList<Integer>al=new ArrayList<>();
   al.add(8);
   al.add(9);
   al.add(3);
   al.add(5);
   
   al.forEach((n)->System.out.println(n*n));

   ArrayList<String>s=new ArrayList<>();
   s.add("Akshat");
   s.add("Abhishek");
   s.add("Rushi");
   
   s.forEach((x)->System.out.println(x+"  "+x.length()));
   s.forEach((y)->System.out.println(y.toUpperCase()));
   
	}

}
