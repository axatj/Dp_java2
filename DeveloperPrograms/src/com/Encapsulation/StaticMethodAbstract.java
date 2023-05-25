package com.Encapsulation;

abstract class Shape {
	public static int Sum(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
		return sum;
	}
}

class Size extends Shape {
	void display() {
		super.Sum(1, 2);
		System.out.println("Hello");

	}
}
public class StaticMethodAbstract {
	public static void main(String[] args) {
		Size s = new Size();
		s.display();
	}

}
