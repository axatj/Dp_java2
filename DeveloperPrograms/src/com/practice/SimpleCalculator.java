//wrtie a java program to create simple Calculator
package com.practice;
import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First number:");
    int number1=sc.nextInt();
    System.out.println("Enter Second Number:");
    int number2=sc.nextInt();
    System.out.println("Enter your choice:");
    int choice=sc.nextInt();
    System.out.println("1.Addition\n2.multiplication\n3.division\n4.substraction");
    switch(choice)
    {
    case 1:System.out.println("Addition" +(number1+number2));
    break;
    case 2:System.out.println("Multiplication" +(number1*number2));
    break;
    case 3:System.out.println("Division" +(number1/number2));
    break;
    case 4:System.out.println("Substraction" +(number1-number2));
    break;
    default:System.out.println("Invalid output:");
    }
	}

}
