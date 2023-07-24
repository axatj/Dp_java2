package com.interthreadcomm;

class Account {
	int amount = 1000;

	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + "->Going to withdraw" + amount);
		if ((this.amount - amount < 100)) {
			System.out.println("Insufficient balance" + this.amount);

			System.out.println(Thread.currentThread().getName() + "Waiting for depoist");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("----------");
			withdraw(amount);
		} else {
			this.amount = this.amount - amount;
			System.out.println("Withdraw successful" + amount);
			System.out.println("Balance left" + this.amount);
			System.out.println("-------------");
		}
	}

	public synchronized void depoist(int amount) {
		try {
			Thread.sleep(400);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-------");
		this.amount = this.amount + amount;
		System.out.println(Thread.currentThread().getName() + "has depoisted" + amount);
		System.out.println("Balance " + this.amount);
		notify();
	}
}

public class AccountInterthreadcomm {

	public static void main(String[] args) {
		Account a1 = new Account();
		Thread son = new Thread() {
			public void run() {
				a1.withdraw(3000);
			}

		};
		son.setName("Son");
		Thread Father = new Thread() {
			public void run() {
				a1.depoist(1000);
			}
		};
		Father.setName("father");
		Thread mother = new Thread() {
			public void run() {
				a1.depoist(2500);
			}
		};
		mother.setName("mother");
		son.start();
		Father.start();
		mother.start();
	}

}
