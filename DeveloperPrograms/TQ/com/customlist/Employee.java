package com.customlist;

import java.util.*;

public class Employee {
	int emp_id;
	String name;
	int salary;
	String department_name;

	public Employee(int emp_id, String name, int salary, String department_name) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.department_name = department_name;
	}

	public Employee() {

	}

	public void display(ArrayList<Employee> ep) {
		for (Employee e : ep) {
			if (e.salary > 30000) {
				System.out.println("display list of employee" + e);

			}
		}
	}

	public void display_sales(ArrayList<Employee> emp3) {
		for (Employee e : emp3) {
			if (e.department_name.equalsIgnoreCase("sales")) {
				System.out.println("display list of employee" + e);
			}
		}

	}

	public String toString() {
		return emp_id + " " + name + " " + salary + " " + department_name;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp2 = new Employee();
		ArrayList<Employee> Emp = new ArrayList();
		for (int i = 1; i < 3; i++) {
			System.out.println("Enter employee id");
			int emp_id = sc.nextInt();
			System.out.println("Enter employee name");
			String emp_name = sc.next();
			System.out.println("Enter employee salary");
			int salary = sc.nextInt();
			System.out.println("Enter department name");
			String d_name = sc.next();

			Emp.add(new Employee(emp_id, emp_name, salary, d_name));
		}
		System.out.println("---------------");

		emp2.display(Emp);
		emp2.display_sales(Emp);
	}

}
