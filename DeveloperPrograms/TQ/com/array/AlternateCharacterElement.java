package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateCharacterElement {
	public static void alternateE(char ch[]) {
		System.out.println(Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'X') {
				ch[i] = (char) (ch[i] + 2);
			} else if (ch[i] >= 'a' && ch[i] <= 'x') {
				ch[i] = (char) (ch[i] + 2);
			} else if (ch[i] >= 'Y') {
				ch[i] = (char) (ch[i] - 24);
			} else if (ch[i] <= 'y') {
				ch[i] = (char) (ch[i] - 24);

			} else if (ch[i] >= 'Z') {
				ch[i] = (char) (ch[i] - 23);
			} else if (ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 23);
			} else {
				ch[i] = ch[i];
			}
		}
		System.out.println(Arrays.toString(ch));
	}

	public static void main(String[] args) {
		char ch[] = new char[6];
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the elements of array");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = Sc.next().charAt(0);
		}
		AlternateCharacterElement.alternateE(ch);
	}
}
