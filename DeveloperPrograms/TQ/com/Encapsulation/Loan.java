package com.Encapsulation;

import java.util.Scanner;

public class Loan {

	public static double loan(double annualInterestRate) {
		double monthlyInterestRate;
		monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;

	}

	public static double loan(double monthlyInterestRate, int numberOfMonths, double loanAmount) {
		double monthlyPayment;
		double loan;
		loan = (monthlyInterestRate * loanAmount) / 1 - (1 + monthlyInterestRate - numberOfMonths);
		return monthlyPayment = loan;

	}

	public static void display(double loanAmount, double annualInterestRate, int numberOfMonths,
			double monthlyPayment) {
		System.out.println("loan AMount " + loanAmount);
		System.out.println(annualInterestRate);
		System.out.println(numberOfMonths);
		System.out.println(monthlyPayment);
	}

	public static void main(String[] args) {
		Loan l = new Loan();
		double loanAmount;
		double annualInterestRate;
		int numberOfMonths;
		double monthlyPayment;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of loan");
		loanAmount = sc.nextDouble();
		System.out.println("Enter anuual interest Rate");
		annualInterestRate = sc.nextDouble();
		l.display(167000, 10.67, 36, 6124.20);

	}

}
