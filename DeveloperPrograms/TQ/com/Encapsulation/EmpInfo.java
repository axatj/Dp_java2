package com.Encapsulation;

import java.util.Scanner;

public class EmpInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter id");
		int id=sc.nextInt();
		emp.setId(id);
        emp.setName("Akshat");
        emp.setSalary(200000);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        }

}
