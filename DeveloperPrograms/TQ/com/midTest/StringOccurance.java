package com.midTest;
import java.util.*;
public class StringOccurance {
	public static void main(String[] args) {
		String s = "core java and advanced java";
		String[] str = s.split(" ");
		String updstr = " ";
		for (String st : str) {
			if (!st.equalsIgnoreCase("java")) {
				updstr += st + " ";
			}
		}
		System.out.println(updstr);
	}
}