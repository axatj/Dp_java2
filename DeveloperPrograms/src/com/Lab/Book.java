package com.Lab;
import java.util.Scanner;
public class Book {
	int id;
String book_name;
	int price;
	String author_name;
Book(int id,String book_name,int price,String author_name)
{
this.id=id;
this.book_name=book_name;
this.price=price;
this.author_name=author_name;
}
public void showBook()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter author Name:");
	String a_name=sc.nextLine();
	if(a_name.equals(author_name));
	{
	  price=price-50;
	  System.out.println("price will be="+price);
	}
	
	 
}

	public static void main(String[] args) {
	 Book b=new Book(123,"AmazingSecretsofLife",200,"GaurGoaplDas");
	 b.showBook();
	}

}
