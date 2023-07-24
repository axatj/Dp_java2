package com.hashmaplab;

import java.util.*;

public class Customer {
	int code;
	String name;
	String address;
	float balance;

public Customer()
{
	}
	public Customer(int code, String name, String address, float balance) {
		this.code = code;
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	public String toString1() {
		return code + " " + name + " " + address + " " + balance;
	}

	public Customer(String name, String address, float balance) {
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	public String toString() {
		return name + " " + address + " " + balance;
	}

	public void search(HashMap<Integer,Customer>hs)
	{
		System.out.println("Enter the id search by customer ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(hs.get(a));
	}
	public static void main(String[] args) {
		ArrayList<Customer> al = new ArrayList<>();
		String s;
		HashMap<Integer, Customer> hs = new HashMap<>();
		al.add(new Customer(101, "pooja", "pune", 100000));
		al.add(new Customer(102, "sonal", "satara", 200000));
		al.add(new Customer(103, "suraj", "nagpur", 300000));
		Iterator<Customer> itr = al.iterator();
		while (itr.hasNext()) {
			Customer c = itr.next();
			hs.put(c.code, new Customer(c.name,c.address,c.balance));
		}
		System.out.println(hs);
		Customer cs=new Customer();
          cs.search(hs);
		
	}

}
