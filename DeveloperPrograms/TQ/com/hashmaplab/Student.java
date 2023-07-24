package com.hashmaplab;

import java.util.*;

public class Student {
	int id;
	String name;
	int percentage;

	public Student(int id, String name, int percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public String toString() {
		return id + " " + name + " " + percentage;
	}

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		String s;
		HashMap<String, String> hs = new HashMap<>();
		al.add(new Student(1, "pooja", 78));
		al.add(new Student(2, "sonal", 90));
		al.add(new Student(3, "rupal", 45));
		al.add(new Student(4, "jayesh", 34));

		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = itr.next();
			int per1 = st.percentage;
			if (per1 <= 90 && per1 >= 35) {
				s = "pass";
				hs.put(st.name, s);
			} else {
				s = "fail";
				hs.put(st.name, s);
			}
		}
		System.out.println(hs);
	}

}
