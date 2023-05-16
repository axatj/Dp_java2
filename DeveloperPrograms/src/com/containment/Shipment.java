package com.containment;
class Order
{
private int cust_id;
String city;
public void setCust_Id(int cust_id)
{
this.cust_id=cust_id;	
}
public void setCity(String city)
{
this.city=city;
}
public int getCust_Id()
{
return cust_id;	
}
public String getCity()
{
return city;
}
}
class MyDate
{
private int mm;
private int dd;
private int yyyy;

public void setMM(int mm)
{
this.mm=mm;	
}
public void setDD(int dd)
{
this.dd=dd;
}
public void setYYYY(int yyyy)
{
this.yyyy=yyyy;	
}
public int getMM()
{
return mm;	
}
public int getDD()
{
return dd;	
}
public int getYYYY()
{
return yyyy;	
}

}

public class Shipment {
 
private int ship_id;
private Order o;
private MyDate date;

public void setShip_Id(int ship_id)
{
this.ship_id=ship_id;
}
public void setO(Order o)
{
this.o=o;	
}
public void setDate(MyDate date)
{
this.date=date;	
}
public int getShip_Id()
{
return 	ship_id;
}
public Order getO()
{
return o;	
}
public MyDate getDate()
{
return date;	
}
	 
	 public static void main(String[] args) {
 	
	 Shipment s=new Shipment();
	 s.setShip_Id(101);
	 s.setO(new Order());
	 Order or=s.getO();
	 or.setCust_Id(4321);
	 or.setCity("Pune");
	 s.setDate(new MyDate());
     MyDate date=s.getDate();
     date.setDD(15);
     date.setMM(05);
     date.setYYYY(2023);
	 System.out.println(s.getShip_Id());
	 System.out.println(or.getCust_Id());
	 System.out.println(or.getCity());
	 System.out.println(date.getDD());
	 System.out.println(date.getMM());
	 System.out.println(date.getYYYY());
	 
	 }

}
