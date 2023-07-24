package com.treemaplab;
import java.util.*;
public class EmployeeMain {
	TreeMap<Employee,String> tm=new TreeMap<>(new EmployeeNameComparator());
    void addData()
    {
    tm.put(new Employee(14,373733,"Hr","Raj"),"24387942");
	tm.put(new Employee(12,700000,"It","Akshat"),"123456789 ");
	tm.put(new Employee(9,80033,"hr","Atul"),"34972374 ");
	tm.put(new Employee(8,7021000,"finance","Amey"),"3298641 ");
	tm.put(new Employee(6,1200000,"sales","Abhishek"),"43287832 ");
	tm.put(new Employee(32,7123000,"medical","Anand"),"81843962" );
	tm.put(new Employee(21,704234100,"art","Abhi"),"389471236" );
	tm.put(new Employee(16,70044433,"marketing","Anmol"),"291368312 ");

    	
    	
    	
    	System.out.println(tm);
    	
    }
	
	public static void main(String[] args) {

    EmployeeMain obj=new EmployeeMain();
    obj.addData();
	}

}
