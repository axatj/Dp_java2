package com.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
int id;
String name;
int salary;
public Employee(int id,String name,int salary)
{
this.id=id;
this.name=name;
this.salary=salary;
}
public String toString()
{
return id+" "+name+" "+salary;	
}

}
public class ListDemo {

	public static void main(String[] args) {
    ArrayList<Employee>al=new ArrayList();
    al.add(new Employee(1,"pooja",1000));
    al.add(new Employee(2,"ram",2000));
    al.add(new Employee(3,"sonal",3000));
    for(Employee e:al)
    {
    	System.out.println(e);
    	
    }
    
    System.out.println("-------------");
    
 Collections.sort(al,new  MySalComparator());
    
    for(Employee e:al)
    {
    	
    	System.out.println(e);
    }
	System.out.println("===============");
  Collections.sort(al, new MyNameComparator()); 
  for(Employee e:al)
  {
	  System.out.println(e);
  }
    
	}
}

class MyNameComparator implements Comparator<Employee>

{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	}
 		class MySalComparator implements Comparator<Employee>
		{

			@Override
			public int compare(Employee o1, Employee o2) {
		     
				return o2.salary-o1.salary;
			}
			
}