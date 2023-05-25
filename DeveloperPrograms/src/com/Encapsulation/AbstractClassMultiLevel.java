package com.Encapsulation;
abstract class Add {
	int a = 30;
	
	 abstract void add();
}
abstract class Sum extends Add {
int sum=30;
	 abstract void sum();  
}
class  Total extends Sum {
int y;
	public void add()
{
y= a+sum;
}

public void sum()
{
	System.out.println(y);}

}
	 

public class AbstractClassMultiLevel {
	public static void main(String[] args) {
	 Total t=new Total();
	t.add();
	t.sum();
		
	}

}