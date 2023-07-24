package com.ArrayOfObject;

import java.util.Scanner;

class Student2
{
int sid;
String sname;
int marks;
public Student2(int sid,String sname,int marks)
{
this.sid=sid;
this.sname=sname;
this.marks=marks;
}

public String toString()
{
return sid+" "+sname+" "+marks; 	
}
	
}

public class Course {
int cid;
String cname;
Student student2;
public Course(int cid,String cname,Student student2)
{
this.cid=cid;
this.cname=cname;
this.student2=student2;
}
public String toString()
{
return cid+" "+cname+" "+student2;	
}
	
	public static void main(String[] args) {
	Course c[]=new Course[2];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<c.length;i++)
	{
		System.out.println("Enter the course id");
		int cid=sc.nextInt();
		System.out.println("Enter the course name");
		String cname=sc.next();
		System.out.println("Enter the student details");
		System.out.println("Enter id");
		int sid=sc.nextInt();
		System.out.println("Enter the Student name");
		String sname=sc.next();
		System.out.println("Enter the marks");
		int mk=sc.nextInt();
		
		c[i]=new Course(cid,cname,new Student(sid,sname,mk));
		
	}
	System.out.println("------------");
	 for(int i=0;i<c.length;i++)
	 {
		 System.out.println(c[i]);
	 }
	 //find the course which has students with marks more than 70
	 for(int i=0;i<c.length;i++)
	 {
		 if(c[i].student2.marks>70)
		 {
			 System.out.println(c[i]);
		 }
	 }
}
}