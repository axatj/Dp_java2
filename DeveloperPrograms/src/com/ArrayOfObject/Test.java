package com.ArrayOfObject;

import java.util.Scanner;

class Employee{
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

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp[]=new Employee[3];
    //emp[0]=new Employee(101,"Yash",67000);
    //emp[1]=new Employee(102,"Sonia",77000);
    //emp[2]=new Employee(102,"ram",50000);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the employee details");
    for(int i=0;i<emp.length;i++)
    {
    	System.out.println("Enter the id");
    	int id=sc.nextInt();
    	System.out.println("Enter the name");
    	String name=sc.next(); 
    	System.out.println("Entet the salary");
    	int salary=sc.nextInt();
    	
    	emp[i]=new Employee(id,name,salary);
    }
   
    
    
    
    System.out.println("------------");
    for(int i=0;i<emp.length;i++)
    {
    //	System.out.println(emp[i].id+" "+emp[i].name+" "+emp[i].salary);
    
    	System.out.println(emp[i]);
    }
    System.out.println("---------");
   // for(Employee e:emp) {
   // 	System.out.println(e);
    //}
    
    //find employee with salary more than 50000
    for(int i=0;i<emp.length;i++)
    {
    	if(emp[i].salary>50000) {
    		System.out.println(emp[i]);
    	}
    }
	}

}
