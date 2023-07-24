package com.interthreadcomm;

class SharedRes {
	public synchronized void methodOne() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " has locked one");
		System.out.println(Thread.currentThread().getName() + "released one");
		wait();
		System.out.println(Thread.currentThread().getName() + "has finished");
	}

	public synchronized void methodTwo() throws InterruptedException {
		 
		notifyAll();
		System.out.println(Thread.currentThread().getName() + "has notified");
	}
}

public class Interthread2 {

	public static void main(String[] args) {
		SharedRes r = new SharedRes();
		new Thread() {
			public void run() {
				try {
					r.methodOne();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					r.methodTwo();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
