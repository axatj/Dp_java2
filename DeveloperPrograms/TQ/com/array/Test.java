package com.array;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 10; i++) {
			al.add(sc.nextInt());
		}
		for (int i : al)
			if (i % 2 != 0) {
				System.out.println(i);
			}
	}

}