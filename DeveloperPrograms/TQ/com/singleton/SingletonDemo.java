package com.singleton;

public class SingletonDemo {

	// rule 1
	private static SingletonDemo sobj = new SingletonDemo(); // early
	public String msg;

	// rule 2
	private SingletonDemo() {
		msg = "Welcome";
	}

	public static SingletonDemo getInstance() {
		if (sobj == null) {
			sobj = new SingletonDemo();// lazy

		}
		return sobj;
	}

	public static void main(String[] args) {
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();
		SingletonDemo s3 = SingletonDemo.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);

		s1.msg = "hi";

		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);

	}

}
