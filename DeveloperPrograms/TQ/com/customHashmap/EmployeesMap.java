package com.customHashmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeesMap {

	public static void main(String[] args) {
		HashMap<Integer, Employee> emap = new HashMap();
		emap.put(101, new Employee(101, "Akshat", 1000000));
		emap.put(102, new Employee(102, "Amey", 900000));
		emap.put(103, new Employee(103, "Atul", 800000));
		emap.put(104, new Employee(104, "Abhishek", 700000));
		emap.put(105, new Employee(105, "vijay", 600000));

		for (Map.Entry<Integer, Employee> en : emap.entrySet()) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		System.out.println("-------------");

		emap.put(102, new Employee(102, "Amey", 890000));
		for (Map.Entry<Integer, Employee> en : emap.entrySet()) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
	}
}
