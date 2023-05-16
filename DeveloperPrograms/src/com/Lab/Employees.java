package com.Lab;

public class Employees {
	int id;
	String name;
	int salary;
	int age;
	public void accept_details(int eid,String ename,int esalary,int eage)
	{
		id=eid;
		name=ename;
		salary=esalary;
		age=eage;
		
	}
	public void display()
	{
		System.out.println(id+""+name+""+salary+""+age);
	}
	public void getBonus()
	{
		if(age>60)
		{
			salary=salary+5000;
		}
		else if(age>40)
		{
			salary=salary+2000;
		}
		System.out.println("salary="+salary);
	}

	public static void main(String[] args) {
		Employees e=new Employees();
		e.accept_details(123,"Aj",500000,35);
		e.display();
		e.getBonus();
	}

}
