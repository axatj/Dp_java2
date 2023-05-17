package com.inheritance;

class Employee{
void salary()
{
	System.out.println("Salar=200000");
	}
}
class Programmer extends Employee{
	void bonus()
	{
		System.out.println("Bonus=50000");
	}
	
}

public class Single_Inheritance1 {

	public static void main(String[] args) {
	 Programmer p=new Programmer();
	 p.salary();
	 p.bonus();
	}

}
