//class EMployee {id ,name,salary} do descending wise sorting on basis of salary.print arraylist
//if salary are same sort country in ascending order 

package com.Hashmap;

import java.util.Objects;

public class Employee {
private int id;
private String name;
private double salary;
private String country;
public Employee()
{
}
public Employee(int id,String name,double salary,String country)
{
this.id=id;
this.name=name;
this.salary=salary;
this.country=country;
}
public int hashCode()
{
	return Objects.hash(id,name,salary);
}
public boolean equals(Object obj)
{
if(this==obj)
{
return true;	
}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
