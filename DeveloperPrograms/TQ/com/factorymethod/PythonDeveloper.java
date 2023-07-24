package com.factorymethod;

import java.util.Arrays;

public class PythonDeveloper implements Developer {

	@Override
	public void salaryPaid() {
		System.out.println("Salary is :Rs" + 45000);

	}

	@Override
	public void skills() {
		String arr[] = { "Basic Python", "Data science", "Sql", "Numpy" };
		System.out.println(Arrays.toString(arr));
	}

}
