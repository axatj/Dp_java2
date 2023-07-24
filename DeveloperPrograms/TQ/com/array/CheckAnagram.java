package com.array;
import java.util.*;

public class CheckAnagram {

	public static void Check_Anagram(String str1, String str2) {
		boolean isAnagram = false;
		String st1 = str1.toLowerCase();
		String st2 = str2.toLowerCase();
		if (st1.length() == st2.length()) {
			char[] ch1 = st1.toCharArray();

			char[] ch2 = st2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.out.println(ch1);
			System.out.println(ch2);
			
			String s1 = new String(ch1);
			String s2 = new String(ch2);
			if (s1.equals(s2)) {
				System.out.println("Is anagram");
			} else {
				System.out.println("not anagram");
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String");
		String str2 = sc.nextLine();
		CheckAnagram ca = new CheckAnagram();
		ca.Check_Anagram(str1, str2);

	}

}
