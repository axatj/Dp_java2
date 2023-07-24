package com.threadadv;

class Mythread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);

		}
	}
}

public class ThreadYield {

	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();

		t1.start();
		t2.start();
		for (int i = 1; i <= 3; i++) {
			Thread.yield();
			System.out.println("Welcome-->" + i);
		}
	}
}
