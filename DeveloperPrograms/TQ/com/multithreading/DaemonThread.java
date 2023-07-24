package com.multithreading;

public class DaemonThread extends Thread {
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon" + Thread.currentThread().getName());
		} else {
			System.out.println("User" + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		DaemonThread d1 = new DaemonThread();
		DaemonThread d2 = new DaemonThread();

		d1.setDaemon(true);
		d1.start();
		d2.start();
	}

}
