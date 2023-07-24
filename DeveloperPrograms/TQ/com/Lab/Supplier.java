package com.Lab;
import java.util.*;
class Item2
{
int i_id;
String i_name;
int i_price;
public Item2(int i_id,String i_name,int i_price)
{
this.i_id=i_id;
this.i_name=i_name;
this.i_price=i_price;
}
public String toString()
{
return i_id+" "+i_name+" "+i_price;	
}
}

public class Supplier {
	int id;
	String name;
	Item2 i;
public Supplier(int id,String name,Item2 i)
{
this.id=id;
this.name=name;
this.i=i;
}
public Supplier() {
	 
}
public String toString()
{
return id+" "+name+" "+i;	
}
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Supplier sp=new Supplier();
    
	System.out.println("Enter no of supplier");
	int s=sc.nextInt();
	ArrayList<Supplier>al=new ArrayList<>();
	for(int i=0;i<s;i++)
	{
	System.out.println("Enter supplier id");
	int id=sc.nextInt();
	System.out.println("Enter supplier name");
	String name=sc.next();
	System.out.println("Enter item details");
	System.out.println("Enter item id");
	int i_id=sc.nextInt();
	System.out.println("Enter item name");
	String i_name=sc.next();
	System.out.println("Enter item price");
	int price=sc.nextInt();
	al.add(new Supplier(id,name,new Item2(i_id,i_name,price)));
	 
	}
	System.out.println("----------");
	Iterator<Supplier>itr=al.iterator();
	while(itr.hasNext())
	{
		Supplier st=itr.next();
		if(st.i.i_price>100)
		{
			System.out.println(st.name);
		}
				
	}
	}
}
