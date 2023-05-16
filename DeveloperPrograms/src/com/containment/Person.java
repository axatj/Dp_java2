package com.containment;
class Address
{
int pincode;
String city;
public Address(int pincode,String city)
{
this.pincode=pincode;
this.city=city;
}
public String toString()
{
return pincode+" "+city;	
}

}

public class Person {
int pid;
String name;
Address adr;
public Person(int pid,String name,Address adr)
{
this.pid=pid;
this.name=name;
this.adr=adr;
}
public String toString()
{
return pid+" "+name+" "+adr;	
}


	public static void main(String[] args) {
	Person p=new Person(101,"Akshat",new Address(123,"Pune"));
	System.out.println(p);
	}

}
