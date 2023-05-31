package com.test2;

public class Test {

	public static void main(String[] args) {
	Parent ch1=new Child();
	System.out.println(ch1.num);
	ch1.show();
	}

}
class Parent{
	int num=100;
	public void show() {
		System.out.println("I am parent");
	}
}

class Child extends Parent{
	int num=200;
	public void show()
	{
		System.out.println("I am child");
		
	}
}