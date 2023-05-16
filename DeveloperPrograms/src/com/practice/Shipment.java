package com.practice;

class Order
{
int cust_id;
String city;

public Order(int cust_id,String city)
{
this.cust_id=cust_id;
this.city=city;
}
}
class Mydate 
{
  int mm;
  int dd;
  int yy;

public Mydate(int mm,int dd,int yy)
{
  this.mm=mm;
  this.dd=dd;
  this.yy=yy;
  }
}

public class Shipment {


int shp_id;
Order o;
Mydate date;

  
public Shipment(int shp_id,Order o,Mydate date)
{
  this.shp_id=shp_id;
  this.o=o;
  this.date=date;
}
  public static void main(String[] args) {
  Shipment s=new Shipment(123,new Order(567,"Pune"),new Mydate(05,12,2023));
  System.out.println(s.shp_id);
  System.out.println(s.o.cust_id);
  System.out.println(s.o.city);
    System.out.println(s.date.mm);
    System.out.println(s.date.dd);
    System.out.println(s.date.yy);
  }

}