package com.TestPaper11;
import java.util.*;

class Dept
{
 int id;
 String name;
 @Override
 public String toString() {
  return "Dept [id=" + id + ", name=" + name + "]";
 }
 public Dept(int id, String name) {
  super();
  this.id = id;
  this.name = name;
 }
 
}
class Employee
{
 int eid;
 String enam;
 int salary;
 Dept d;
 
 public Employee(int eid, String enam, int salary, Dept d) {
  super();
  this.eid = eid;
  this.enam = enam;
  this.salary = salary;
  this.d = d;
 }
  public Employee()
  {
   
  }
 @Override
 public String toString() {
  return "Employee [eid=" + eid + ", enam=" + enam + ", salary=" + salary + ", d=" + d + "]";
 }
 
}
class MyComp implements Comparator<Employee>
{

 @Override
 public int compare(Employee o1, Employee o2) {
  if(o2.d.name.length()==o1.d.name.length())
  {
   return o1.salary-o2.salary;
  }
  else
  {
   return o2.d.name.length()-o1.d.name.length();
  }
 }
 
}
public class SortingOfMap {
  public static void main(String[] args) {
   Employee obj=new Employee();
 TreeMap<Employee, String>tm=new TreeMap<>(new MyComp());
 tm.put(new Employee(1,"Atul",30000,new Dept(10,"Tecchnical")), "Parner");
 tm.put(new Employee(2,"Vijay",40000,new Dept(13,"HR")), "Satara");
 tm.put(new Employee(3,"Rushi",35000,new Dept(12,"Tecchnical")), "Sangali");
 tm.put(new Employee(4,"Abhi",32000,new Dept(14,"Marketing")), "Karad");
 System.out.println(tm);
}
}
