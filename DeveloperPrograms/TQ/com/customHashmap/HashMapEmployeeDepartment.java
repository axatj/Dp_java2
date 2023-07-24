package com.customHashmap;
import java.util.*;
import java.util.Map.Entry;
class Employee1 implements Comparable<Employee>
{
private String name;
private int salary;
private String department;
	 
	

public Employee1(String name,int salary,String department)
{
this.name=name;
this.salary=salary;
this.department=department;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getSalary() {
	return salary;
}



public void setSalary(int salary) {
	this.salary = salary;
}



public String getDepartment() {
	return department;
}



public void setDepartment(String department) {
	this.department = department;
}
@Override
public int compareTo(Employee o)
{
	return Integer.compare(o.getSalary(), this.salary);
	
}


@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
}




 



}
public class HashMapEmployeeDepartment {

	public static void main(String[] args) {
 Map<Employee1,String>amap=new TreeMap<>();
 amap.put(new Employee1("John", 50000, "HR"), "ID001");
 amap.put(new Employee1("Alice", 55000, "IT"), "ID002");
 amap.put(new Employee1("Bob", 60000, "Finance"), "ID003");
 amap.put(new Employee1("Eve", 45000, "HR"), "ID004");
	
 SortedSet<Map.Entry<Employee1, String>> sortedBySalary = new TreeSet<>(
         Comparator.comparing(Map.Entry::getKey) );
 
 sortedBySalary.addAll(amap.entrySet());
 
 System.out.println("Sorted Map by Employee Salary:");
 for (Entry<Employee1, String> entry : sortedBySalary) {
     System.out.println("Employee: " + entry.getKey() + ", ID: " + entry.getValue());
 
     SortedSet<Map.Entry<Employee1, String>> sortedByDepartment = new TreeSet<>(
             Comparator.comparing(e -> e.getKey().getDepartment())
     );
     sortedByDepartment.addAll(amap.entrySet());
     System.out.println("\nSorted Map by Department Name:");
     for (Entry<Employee1, String> entry1 : sortedByDepartment) {
         System.out.println("Employee: " + entry1.getKey() + ", ID: " + entry1.getValue());
     }
 }

 
	}}


