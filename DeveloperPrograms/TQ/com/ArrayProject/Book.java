package com.ArrayProject;

import java.util.Scanner;

public class Book {
	int book_id;
	String book_name;
	int price;
	String author_name;
	Book[] book;
	Scanner sc;

	public Book() {
		sc = new Scanner(System.in);

	}

	public Book(int book_id, String book_name, int price, String author_name) {
		this.book_id = book_id;
		this.book_name = book_name;
		this.price = price;
		this.author_name = author_name;
	}

	public String toString() {
		return book_id + " " + book_name + " " + price + " " + author_name;
	}

	public void insertBook(Book[] book) {
		this.book = book;
	}

	public void showAllBooks() {
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null) {
				System.out.println(book[i]);

			}
		}
	}

	public void findBookById(int id) {
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null) {
				if (book[i].book_id == id) {
					System.out.println(book[i]);
				}
			}
		}
	}

	public void UpdateBook(int id) {
		System.out.println("Enter the price for updation");
		int price = sc.nextInt();
		boolean isUpdated = false;
		for (int i = 0; i < book.length; i++) {
			if (book[1] != null) {
				if (book[i].book_id == id) {
					book[i].price = price;
					isUpdated = true;
				}
			}
		}
		if (isUpdated == true) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Please Check");
		}
	}

	public void DeleteBook(int id) {
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null) {
				if (book[i].book_id == id) {
					for (int j = i; j < book.length-1; j++) {
						book[j] = book[j + 1];
					}
					break;
				}
			}
		}
		for (int i = 0; i < book.length-1; i++) {
			System.out.println(book[i]);
		}
	}
}
