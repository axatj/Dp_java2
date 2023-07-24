package com.Lab;

import java.util.Scanner;

public class Book2 {

	private int id;
	private String book_name;
	private int price;

	public void setId(int id) {
		this.id = id;
	}

	public void setBook_Name(String book_name) {
		this.book_name = book_name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getBook_Name() {
		return book_name;
	}

	public int getPrice() {
		return price;
	}

	public void ShowBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name");
		String s = sc.nextLine();
		if (s.equals(book_name)) {
			price = price - (price * 10 / 100);
			System.out.println("price will be" + price);
		}
	}

	public static void main(String[] args) {
		Book2 b2 = new Book2();
		b2.setId(123);
		b2.setBook_Name("Java");
		b2.setPrice(250);

		System.out.println(b2.getId());
		System.out.println(b2.getBook_Name());
		System.out.println(b2.getPrice());

		b2.ShowBook();
	}

}
