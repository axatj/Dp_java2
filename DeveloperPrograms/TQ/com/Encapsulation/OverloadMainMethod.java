package com.Encapsulation;

public class OverloadMainMethod {
	
	
	public static void main()
	{
		System.out.println("main method called");
	}
	public static void main(int a)
	{
		System.out.println("overload main method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadMainMethod.main();
		OverloadMainMethod.main(60);

	}

}
