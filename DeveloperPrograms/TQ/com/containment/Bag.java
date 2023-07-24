package com.containment;

class Pen {
	String color;
	String name;
	int pen_price;
	Nib nb;

	public Pen(String color, String name, int pen_price, Nib nb) {
		this.color = color;
		this.name = name;
		this.pen_price = pen_price;
		this.nb = nb;
	}

	public String toString() {
		return color + " " + name + " " + pen_price + " " + nb;
	}
}

class Nib {
	String material;
	int price;

	public Nib(String material, int price) {
		this.material = material;
		this.price = price;
	}

	public String toString() {
		return material + " " + price;
	}
}

public class Bag {
	String Brand_name;
	int price;
	Pen p;

	public Bag(String Brand_name, int price, Pen p) {
		this.Brand_name = Brand_name;
		this.price = price;
		this.p = p;
	}

	public String toString() {
		return Brand_name + " " + price + " " + p;
	}

	public static void main(String[] args) {
		// Bag b = new Bag("American", 3000, new Pen("Black", "Cello", 25, new
		// Nib("plastic", 300)));
		Bag b = new Bag("Hp", 4000, new Pen("Blue", "goldex", 25, new Nib("plastic", 30)));
		System.out.println(b);
	}

}
