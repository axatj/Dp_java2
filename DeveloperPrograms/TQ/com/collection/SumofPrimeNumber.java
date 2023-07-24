package com.collection;

import java.util.*;

public class SumofPrimeNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
//	al.add(2);
//	al.add(4);
//	al.add(9);
//	al.add(7);
//	al.add(11);
//	al.add(13);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();

		for (int k = 0; k < size; k++) {
			al.add(sc.nextInt());
		}

		int sum = 0;
		for (int i = 0; i < al.size(); i++) {

			boolean isPrime = true;
			for (int j = 2; j < al.get(i); j++) {
				if (al.get(i) % j == 0) {
					isPrime = false;
					break;
				}
			}
			sc.close();
			if (isPrime) {
				sum = sum + al.get(i);
			}
		}
		
		System.out.println(sum);
	}
}