package com.practice;
import java.util.Scanner;
public class EquilateralTriangle {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter side");
    double a=sc.nextDouble();
    double et=1.73*(a*a)/4;
    System.out.println("Area of Equilateral triangle:"+et);

	}

}
