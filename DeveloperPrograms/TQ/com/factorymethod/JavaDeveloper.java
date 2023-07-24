package com.factorymethod;

import java.util.Arrays;

public class JavaDeveloper implements Developer {

	@Override
	public void salaryPaid() {
		System.out.println("Salary is :Rs" + 50000);
	}

	@Override
	public void skills() {
		String arr[] = { "corejava", "Basic Sql", "collections", "html" };

		System.out.println(Arrays.toString(arr));
	}

}
