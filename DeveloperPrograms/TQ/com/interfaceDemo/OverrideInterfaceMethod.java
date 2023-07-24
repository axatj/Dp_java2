package com.interfaceDemo;

interface OverrideInterfaceMethod {

	public void show();
	default void display() {
		System.out.println("Method 1");
	}
}
 	
interface Override1  {
	public void show();
	default void display(){
		System.out.println("Method 2");
		
	}


public class Override3 implements OverrideInterfaceMethod,Override1{

	public void show()
	 {
		System.out.println("This is class");
	}
public void display()
{
	}
}	


		public static void main(String[] args) {
		 Override3 o3=new Override3();
        o3.show();
        o3.display();
        
		
		}
		

}