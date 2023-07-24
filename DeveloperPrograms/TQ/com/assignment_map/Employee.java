package com.assignment_map;

import java.util.Comparator;

class Employee1{
	int id;
	String name;
	double salary;
	String country;
	public Employee1(int id, String name, double salary, String country) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}

class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return this.compare(o1, o2);
	
	if(salary!=0)
	{
	return (int) salary;	
	}else {
		
	return  0;
	}
	}
}	
}

public class Employee {
	public static void main(String[] args) {


	}

}
