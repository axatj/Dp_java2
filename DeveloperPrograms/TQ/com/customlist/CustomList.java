package com.customlist;

import java.util.*;

class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return id + " " + name + " " + marks;
	}

	public int compareTo(Student s) {
		if (this.id > s.id) {
			return -1;
		} else if (this.id < s.id) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class CustomList {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter student id");
			int id = sc.nextInt();
			System.out.println("Enter student name");
			String name = sc.next();
			System.out.println("Enter student marks");
			int mk = sc.nextInt();
			al.add(new Student(id, name, mk));
		}
		System.out.println("------------");
		for (Student s : al) {
			System.out.println(s);
		}
	}

}
