package com.Encapsulation;

public class StaticMethod {
	
	
	public static void display()
	{ 
		
		System.out.println("Static method called");
		
	}
	public static void display(int x)
	{
		
	System.out.println("overload static method");
		
	}
 	

	public static void main(String[] args) {
		StaticMethod.display();
		StaticMethod.display(60);

	}

}
