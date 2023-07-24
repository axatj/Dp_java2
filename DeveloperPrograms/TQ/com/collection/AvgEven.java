package com.collection;

import java.util.*;

public class AvgEven {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(12);
		al.add(13);
		al.add(14);
		int avg=0;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 == 0) {
				System.out.println(al.get(i));
				avg=avg/al.size();
				
			}
		}
		
	}
}
