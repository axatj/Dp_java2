package com.basics;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		float english,chemistry,physics,maths,science;
		double total,percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of Five subjects");
		
		System.out.println("Enter the marks of English");
		english=sc.nextFloat();
		
		System.out.println("Enter the marks of Chemistry");
		chemistry=sc.nextFloat();
		
		System.out.println("Enter the marks of Physics");
	    physics=sc.nextFloat();
		
	    System.out.println("Enter the marks of Maths");
		maths=sc.nextFloat();
		
		System.out.println("Enter the marks of Science");
		science=sc.nextFloat();
		
		total=english+chemistry+physics+maths+science;
		percentage=(total/500)*100;
		
		System.out.println("Total marks="+total);
		
		System.out.println("Percentage="+percentage);
		

	}

}
