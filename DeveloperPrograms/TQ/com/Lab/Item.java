package com.Lab;

import java.util.*;

public class Item {

	int id;
	String name;
	float price;

	public Item(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return id + " " + name + " " + price;
	}

	public static void main(String[] args) {
		ArrayList<Item> it = new ArrayList<>();
		it.add(new Item(1, "soap", 150));
		it.add(new Item(2, "pulses", 130));
		it.add(new Item(3, "oil", 150));

		for (int i = 0; i < it.size(); i++) {
			for (int j = i + 1; j < it.size(); j++) {
				if (it.get(i).price == it.get(j).price) {
					System.out.println(it.get(i).name);
					System.out.println(it.get(j).name);
				}
			}
		}
	}

}
