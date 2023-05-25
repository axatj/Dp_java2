package com.ArrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

class Menu{

	int mid;
	String mname;
	int mprice;
	public Menu(int mid,String mname,int mprice)
	{
		this.mid=mid;
		this.mname=mname;
		this.mprice=mprice;
	}
	public String toString()
	{
		return mid+" "+mname+" "+mprice;
	}
}


public class Order {

	int oid;
	int oquantity;
	Menu[] m;
	public Order(int oid,int oquantity,Menu[] m)
	{
		this.oid=oid;
		this.oquantity=oquantity;
		this.m=m;
	}
	@Override
	public String toString() {
		return oid+" "+oquantity+" "+Arrays.toString(m);
	}
	
	public static void main(String[] args) {
	Order o[]=new Order[3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<o.length;i++)
	{
		System.out.println("Enter the order id");
		int oid=sc.nextInt();
		System.out.println("Enter the quantity");
		int oquantity=sc.nextInt();
		System.out.println("Enter menu");
		int n=sc.nextInt();
		Menu[]m=new Menu[n];
		System.out.println("Enter the menu details");
		for(int j=0;j<m.length;j++)
		{
			System.out.println("Enter the menu id");
			int mid=sc.nextInt();
			System.out.println("Enter the name");
			String mname=sc.next();
			System.out.println("Enter the price");
			int mprice=sc.nextInt();
			m[j]=new Menu(mid,mname,mprice);
		}
		o[i]=new Order(oid,oquantity,m);
	}
System.out.println("-----------------");
for(Order or:o)
{
	System.out.println(or);
	}
	}
}
