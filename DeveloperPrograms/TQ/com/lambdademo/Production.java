package com.lambdademo;

class Product {
	int noofItems = 10;

	public synchronized void produce(int noofItems) {
		System.out.println(Thread.currentThread().getName() + "produce :" + noofItems);

		this.noofItems = this.noofItems + noofItems;
		System.out.println("Total items Availble : " + this.noofItems);
		System.out.println("------------------");
		notify();

	}

	public synchronized void consume(int noofItems) {
		System.out.println(Thread.currentThread().getName() + "Consume:" + noofItems);
		if ((this.noofItems - noofItems) < 0) {
			System.out.println("no items will be consume:" + this.noofItems);
			System.out.println(Thread.currentThread().getName() + "waiting for produce");
		} else {
			this.noofItems = this.noofItems - noofItems;
			System.out.println("consume successful " + noofItems);
		}
	}

}

public class Production {

	public static void main(String[] args) {
		Product p1 = new Product();
//		Thread t1 = new Thread() {
//			public void run()
//			{
//			p1.produce(3);
//			p1.consume(4);
//			}
//		};
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());

			}
		};
		Runnable r2 = () -> System.out.println(Thread.currentThread().getName());
	}
}
