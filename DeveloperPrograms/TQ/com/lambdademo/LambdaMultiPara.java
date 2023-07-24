package com.lambdademo;

interface Addition {
	void add(int n1, int n2);
}

public class LambdaMultiPara {

	public static void main(String[] args) {
		Addition a1 = (n1, n2) -> {
			System.out.println("First number" + n1);
			System.out.println("Second number" + n2);
			System.out.println("Sum is " + (n1 + n2));

		};
		a1.add(45, 32);
		System.out.println("-----------");

		// body can be omitted
		Addition a2 = (int n1, int n2) -> System.out.println("Sum is" + (n1 + n2));
		a2.add(40, 30);
	}

}
