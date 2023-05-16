package com.containment;
class Employee2
{
int eid;
String ename;

public Employee2(int eid,String ename)
{
this.eid=eid;
this.ename=ename;
}
public String toString()
{
return eid+" "+ename;	
}
}

public class Department2 {

int did;
String dname;
Employee2 emp;

public Department2(int did,String dname,Employee2 emp)
{
this.did=did;
this.dname=dname;
this.emp=emp;
}
public String toString()
{
return did+" "+dname+" "+emp;	
}
	public static void main(String[] args) {
    Department2 d2=new Department2(123,"Akshat",new Employee2(342,"Jain"));
    System.out.println(d2);
	}

}
