package com.inheritance;
class StaticMethod{

	public static void display(){
		System.out.println("Static method called");
	}
	
}

public class ShowCode extends StaticMethod{
    final int y=34;
	static final int x;
	static
	{
		x=45;
	}
	public void show()
{
		 
System.out.println(y);
System.out.println(x);
}
	ShowCode()
	{
		
		System.out.println("Akshat");
	}
	
	public static void main(String[] args) {
	 ShowCode s=new ShowCode();
	 s.show();
	 s.display();
	}

}
