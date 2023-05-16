package com.containment;
class Address2
{
private int pincode;
private String city;

public void setPincode(int pincode)
{
this.pincode=pincode;	
}
public void setCity(String city)
{
this.city=city;	
}
public int getPincode()
{
return pincode;	
}
public String getCity()
{
return city;	
}
public String toString()
{
return pincode+" "+city;	
}
}
public class Person2 {
private int pid;
private String pname;
private Address2 adr;

public void setPid(int pid)
{
this.pid=pid;
}
public void setPname(String pname)
{
this.pname=pname;	
}
public void setAdr(Address2 adr)
{
this.adr=adr;	
}
public int getPid()
{
return pid;	
}
public String getPname()
{
return pname;	
}
public Address2 getAdr()
{
return adr;	
}
public String toString()
{
return pid+" "+pname+" "+adr;
}
	public static void main(String[] args) {
	Person2 p2=new Person2();
	p2.setPid(101);
	p2.setPname("AKshat");
	p2.setAdr(new Address2());
	Address2 a2=new Address2();
	a2.setPincode(473);
	a2.setCity("Pune");

	System.out.println(p2.getPid());
	System.out.println(p2.getPname());
	System.out.println(a2.getPincode());
	System.out.println(a2.getCity());
	
	}

}
