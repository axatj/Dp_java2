package com.lambdademo;

public class ThreadLambda {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}

		};
		Thread t1;
		t1 = new Thread(r1, "Mythread");
		t1.start();

		Runnable r2 = () -> System.out.println(Thread.currentThread().getName());
		t1 = new Thread(r2, "LambdaThread");
      	t1.start();
	}
}
