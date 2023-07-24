package com.Lab;

import java.util.*;

public class Students {
	private int roll;
	private String name;
	private int age;
	private int marks;

	public Students(int roll, String name, int age, int marks) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}
	public static void main(String[] args) {
		Students s[] = { new Students(1, "Akshat", 12, 80),
				new Students(2, "Amey", 14, 70),
				new Students(3, "Atul", 13,55 ),
				new Students(4, "suraj", 11, 90) };
        
		for (Students st : s) {
			if(st.getMarks()>60 && st.getAge()<15) { 
			System.out.println("Student roll no is: " + st.getRoll());
				System.out.println("Student name is: " + st.getName());
				System.out.println("Student age is :" + st.getAge());
				System.out.println("Student marks is: " + st.getMarks());
				System.out.println();
			}

}}
}