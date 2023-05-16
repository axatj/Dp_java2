package com.opps;

public class ShoppingDetails {
int customerId;
String ProductName;
int ProductPrice;
int ProductQuantity;
int bill;
public void accept_shopping_details(int sid,String SproductName,int sproductprice,int sproductquantity)
{
	
	customerId=sid;
	ProductName=SproductName;
	ProductPrice=sproductprice;
	ProductQuantity=sproductquantity;
	System.out.println(customerId+""+ProductName+""+ProductPrice+""+ProductQuantity);
	}
public void bill()
{
	bill=ProductPrice*ProductQuantity;
	
	
	}
public void Display_shopping_details()
{
	System.out.println(customerId+""+ProductName+""+ProductPrice+""+ProductQuantity+"");
	System.out.println(bill);
}
	
	public static void main(String[] args) {
    
     ShoppingDetails sho=new ShoppingDetails();
     sho.accept_shopping_details(1232,"TV",50000,1);
     sho.bill();
    sho.Display_shopping_details();

	}
	{
	if(ProductQuantity>0)
	{
		System.out.println(bill);
	}
	 
}}
