package com.collection;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		System.out.println(al.size());
		System.out.println(al.isEmpty());

		al.add("red");
		al.add("pink");
		al.add("blue");
		System.out.println(al);
		al.add("black");
		System.out.println(al);
		al.set(1, "yellow");
		System.out.println(al);
		System.out.println(al.get(1));
		al.remove(0);
		System.out.println(al);

		al.remove("green");
		System.out.println(al);

		ArrayList<String> al2 = new ArrayList<>();

		al2.add("red");
		al2.add("green");

		al2.addAll(1, al);

		System.out.println(al2);

	}
}
