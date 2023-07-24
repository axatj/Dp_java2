package com.treemaplab;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
int id;
int salary;
String name;
String dept;
public Employee(int id, int salary, String name, String dept) {
	 
	this.id = id;
	this.salary = salary;
	this.name = name;
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
}
 @Override
public int compareTo(Employee o) {
	 
	return this.id-o.id;
}


	
}
