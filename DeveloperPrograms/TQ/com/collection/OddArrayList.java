package com.collection;

import java.util.*;

public class OddArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(13);
		al.add(17);
		al.add(21);
		al.add(23);

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 != 0) {
				System.out.println(al.get(i));
			}
		}

	}
}
