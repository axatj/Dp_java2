package com.synchronization;

class Message {
	public void processMessage(String msg) {
		System.out.println("Sending:" + msg);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received:" + msg);
	}
}

public class ThreadWithSynchBlock2 {

	public static void main(String[] args) {
		Message m = new Message();

		Thread t1 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "has started..");
				synchronized (m) {
					m.processMessage("Welcome");
				}

			}
		};

		Thread t2 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "has started..");
				synchronized (m) {
					m.processMessage("Hello");
				}

			}
		};

		Thread t3 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "has started..");
				synchronized (m) {
					m.processMessage("Hi");
				}

			}
		};
		t1.start();
		t2.start();
		t3.start();
	}

}
