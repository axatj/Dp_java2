package com.multithreading;

public class RunnableInterface implements Runnable {
	
	
	@Override
	public void run() {
	 System.out.println(Thread.currentThread().getName());	
	}

	public static void main(String[] args) {
	RunnableInterface r1=new RunnableInterface();
	Thread t1=new Thread(r1,"MyrunThread");
	t1.start();
	}

	

}
