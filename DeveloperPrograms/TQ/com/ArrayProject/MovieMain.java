package com.ArrayProject;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Theatre t[] = new Theatre[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Theatre details");
		for (int i = 0; i < t.length; i++) {
			System.out.println("Enter theatre id");
			int t_id = sc.nextInt();
			System.out.println("Enter theatre name");
			String t_name = sc.next();
			t[i] = new Theatre();
			t[i].setT_id(t_id);
			t[i].setT_name(t_name);
			System.out.println("Enter size");
			int size = sc.nextInt();
			Movie m[] = new Movie[size];
			for (int j = 0; j < m.length; j++) {
				m[j] = new Movie();
				System.out.println("Enter movie id");
				int m_id = sc.nextInt();
				System.out.println("Enter movie name");
				String m_name = sc.next();
				System.out.println("Enter movie rating");
				float rating = sc.nextFloat();
				t[i].setM(m);
				t[i].getM()[j].setM_id(m_id);
				t[i].getM()[j].setM_name(m_name);
				t[i].getM()[j].setRating(rating);
			}
		}
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
}
