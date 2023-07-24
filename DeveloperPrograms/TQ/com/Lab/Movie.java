package com.Lab;
import java.util.Scanner;

public class Movie{
int id;
String name;
float price;
int coupon;

Movie(int eid,String ename,float eprice)
{
	id=eid;
	name=ename;
	price=eprice;
	
	}
public void show_details()
{
	System.out.println("Movie id is:"+id);
	System.out.println("Movie Name is:"+name);
	System.out.println("movie coupon is :"+coupon);
	}
public float getPrice()
{
	return price;
}

}