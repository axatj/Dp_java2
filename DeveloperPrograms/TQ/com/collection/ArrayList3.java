package com.collection;

import java.util.*;

public class ArrayList3 {

	public static void main(String[] args) {
		String[] city = { "pune", "mumbai", "goa" };
		//way1
		ArrayList<String> al = new ArrayList(Arrays.asList(city));
		System.out.println(al);
		
		//way2
		ArrayList<String>al2=new ArrayList();
		Collections.addAll(al2, city);
		System.out.println(al2);
       
		//way3
		ArrayList<String>al3=new ArrayList();
		for(int i=0;i<city.length;i++)
		{
				al3.add(city[i]);
		}
		System.out.println(al3);
	}

}
