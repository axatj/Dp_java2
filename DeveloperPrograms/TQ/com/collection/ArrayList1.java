package com.collection;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// non-generic

		ArrayList list = new ArrayList();
		list.add("pune");
		list.add("goa");
		list.add(45);
		list.add(89.56);

		System.out.println(list);

		// generic

		ArrayList<String> al = new ArrayList<String>();
		al.add("pune");
		al.add("goa");
		al.add("mumbai");
		al.add("nasik");
		al.add(null);
		System.out.println(al);

		System.out.println("--------------------aaa");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-----------ii");
		for (String a : al) {
			System.out.println(a);
		}
		System.out.println("-----------ja");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("--------------jain");

		ListIterator<String> itr2 = al.listIterator();
		while (itr2.hasNext()) {
			itr2.next();
		}
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}

		System.out.println("--------");
		ListIterator<String> itr3 = al.listIterator(al.size());
		while (itr3.hasPrevious()) {

			System.out.println(itr3.previous());
		}
	}

}
