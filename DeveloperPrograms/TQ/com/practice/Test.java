package com.practice;

public class Test {

	public static void main(String[] args) {
		A a = new B();
		a.show();

	}

}

class A {
	public Animal show() {
		System.out.println("call A");
		return null;
	}
}

class B extends A {
	public Dog show() {
		System.out.println("Call b");
		return null;
	}

}

class Animal {

}

class Dog extends Animal {
}