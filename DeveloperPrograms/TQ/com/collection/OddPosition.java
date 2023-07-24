package com.collection;

import java.util.*;

public class OddPosition {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(11);
		al.add(13);
		al.add(14);
		ListIterator<Integer> itr = al.listIterator();
        int count=0;
        while(itr.hasNext())
        {
        	itr.next();
        	System.out.println(itr.hasNext());
        	count++;
        }
	}

}
