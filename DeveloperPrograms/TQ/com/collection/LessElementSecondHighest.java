package com.collection;

import java.util.*;

public class LessElementSecondHighest {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < size; i++) {
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		System.out.println(al);
		for (int j = 0; j < al.size() - 2; j++) {
			sum = sum + al.get(j);
		}
		System.out.println(sum);
	}
}
