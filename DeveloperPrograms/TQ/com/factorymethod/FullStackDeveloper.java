package com.factorymethod;

import java.util.Arrays;

public class FullStackDeveloper implements Developer {

	@Override
	public void salaryPaid() {

		System.out.println("salary is :Rs" + 80000);

	}

	@Override
	public void skills() {
		String arr[] = { "corejava", "BasicSql", "collections", "html", "SpringBoot", "Angular", "React ", "Aws" };

		System.out.println(Arrays.toString(arr));
	}

}
