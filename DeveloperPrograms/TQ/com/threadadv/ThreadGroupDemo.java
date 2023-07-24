package com.threadadv;

public class ThreadGroupDemo implements Runnable {
	public void run() {
//		try
//		{
//			Thread.sleep(300);
//			
//		}catch(InterruptedException e)
//		{
//			e.printStackTrace();
//		}
		if (Thread.interrupted()) {
			System.out.println(Thread.currentThread().getName() + "is iterrupted");
		} else {
			System.out.println(Thread.currentThread().getName() + "is normal");
		}
	}

	public static void main(String[] args) {
		ThreadGroupDemo r1 = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("Parent Group");

		Thread t1 = new Thread(tg1, r1, "Child1");
		Thread t2 = new Thread(tg1, r1, "Child2");
		Thread t3 = new Thread(tg1, r1, "Child3");

		t1.start();
		t2.start();

		System.out.println(tg1.getName());

		System.out.println("Active threads " + tg1.activeCount());
		tg1.interrupt();

	}

}
