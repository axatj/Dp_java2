//write a java progtam to calculate Compound Interest
package com.practice;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Principle:");
    double principle=sc.nextDouble();
    System.out.println("Enter rate:");
    double rate=sc.nextDouble();
    System.out.println("Enter time:");
    double time=sc.nextDouble();
    double ci=principle*(1+(rate/100))*time;
    System.out.println("Compound Interest:"+ci);
	}

}
