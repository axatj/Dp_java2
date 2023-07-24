package com.Lab;

import java.util.*;

public class SecondOccurance {

	public static void Find_Second(String s) {
		int i;
		int count = 0;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
			if (count == 2) {
				break;
			}
		}
		System.out.println("count of second occurance of a is :" + i);
	}

	public static void main(String[] args) {
		String s = "java programs";
		SecondOccurance.Find_Second(s);
	   //  System.out.println(s.indexOf('a',(s.indexOf('a'))+1));
	}

}
