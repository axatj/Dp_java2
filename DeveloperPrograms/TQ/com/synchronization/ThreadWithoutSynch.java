package com.synchronization;

class Table {
	public void printTable(int n) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println((n * i));
			Thread.sleep(500);
		}

	}
}

public class ThreadWithoutSynch {

	public static void main(String[] args) {

		Table tobj = new Table();
		Thread t1 = new Thread() {

			public void run()

			{
				try {
					tobj.printTable(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				try {
					tobj.printTable(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				try {
					tobj.printTable(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}

}
