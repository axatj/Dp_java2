package com.ArrayProject;
import java.util.Scanner;
public class BookInfo {

	public static void main(String[] args) {
    Book book[]=new Book[3];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the book details");
    for(int i=0;i<book.length;i++)
    {
    	System.out.println("Enter the book id");
    	int bid=sc.nextInt();
    	System.out.println("Enter the book name");
    	String bname=sc.next();
    	System.out.println("Enter the price");
    	int price=sc.nextInt();
    	System.out.println("Enter the author name");
    	String a_name=sc.next();
    	book[i]=new Book(bid,bname,price,a_name);
    }
    Book mybook=new Book();
    mybook.insertBook(book);
   
    System.out.println("Show ALL book");
    mybook.showAllBooks();
    
    System.out.println("find book by id");
    mybook.findBookById(1);
    
    System.out.println("Update book by id ");
    mybook.UpdateBook(3);
    mybook.showAllBooks();
    
    System.out.println("Deleted successfully");
    System.out.println("Delete book by id");
    mybook.DeleteBook(2);

	}
}
