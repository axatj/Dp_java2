package com.Lab;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private int[] marks;
	private float average;
	private char grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void calculateAvg() {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		average = (float) sum / marks.length;
	}

	public void findGrade() {
		boolean isfailed = false;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 50) {
				isfailed = true;
				break;
			}
		}
		if (isfailed == true) {
			setGrade('F');
		} else if (getAverage() >= 80 && getAverage() <= 100) {
			setGrade('0');
		} else if (getAverage() >= 50 && getAverage() <= 79) {
			setGrade('A');
		} else {
			setGrade('F');
		}
		 	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size the array");
	    int size=sc.nextInt();
	     Student st=new Student();
	    st.findGrade();
	    st.calculateAvg();
	     
	   
	    
	    		
		 
	}

}
