package com.opps;

public class AccessModifier2 {

	public static void main(String[] args) {
    AccessModifier ac=new AccessModifier();
	//System.out.println(ac.a);//private cannot access other class 
	System.out.println(ac.b);//default can access other class
    System.out.println(ac.c);
    System.out.println(ac.d);
	}

}
