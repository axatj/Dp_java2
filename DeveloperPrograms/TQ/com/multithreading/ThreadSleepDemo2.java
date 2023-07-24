package com.multithreading;

public class ThreadSleepDemo2 extends Thread {
	public static void main(String[] args) {
		{
			Thread t1 = new Thread() {
				public void run() {
					for (int i = 0; i <= 5; i++) {
						System.out.println(Thread.currentThread().getName() + "--->" + i);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};

			Thread t2 = new Thread() {
				public void run() {
					for (int i = 11; i <= 15; i++) {
						System.out.println(Thread.currentThread().getName() + "--->" + i);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};

			Thread t3 = new Thread() {
				public void run() {
					for (int i = 21; i <= 25; i++) {
						System.out.println(Thread.currentThread().getName() + "--->" + i);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			t1.start();
			t2.start();
			t3.start();
		}
	}

}