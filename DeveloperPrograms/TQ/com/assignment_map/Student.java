package com.assignment_map;

import java.util.*;
import java.util.Comparator;

class RollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRollNo() - o2.getRollNo();
	}

}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getName().compareTo(o2.getName());
	}
}
	class AgeComparator implements Comparator<Student> {

		@Override
		public int compare(Student a1, Student a2) {
			return a1.getAge() - a2.getAge();
		}

	}



public class Student {
	private int rollNo;
	private String name;
	private int age;

	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		ArrayList<Student> Students = new ArrayList<>();
		Students.add(new Student(3, "Akshat", 20));
		Students.add(new Student(1, "Amey", 18));
		Students.add(new Student(2, "Atul", 19));
		Students.add(new Student(4, "Abhishek", 21));

		System.out.println("list sort by roll no");
		Collections.sort(Students, new RollNoComparator());
		System.out.println(Students);

		System.out.println("list sort by name");
		Collections.sort(Students, new NameComparator());
		System.out.println(Students);

		System.out.println("List sort by age");
		Collections.sort(Students, new AgeComparator());
		System.out.println(Students);
	}

}