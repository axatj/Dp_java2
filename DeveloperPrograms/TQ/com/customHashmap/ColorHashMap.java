package com.customHashmap;

import java.util.*;

public class ColorHashMap {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 3; i++) {
			System.out.println("Enter the color name");
			String color = sc.next();
			ArrayList<String> al = new ArrayList<>();
			System.out.println("Enter frequency");
			for (int j = 1; j <= 2; j++) {
				al.add(sc.next());
			}
			hm.put(color, al);
		}
		System.out.println("------");
		for (Map.Entry<String, ArrayList<String>> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
