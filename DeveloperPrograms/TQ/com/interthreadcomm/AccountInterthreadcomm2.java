package com.interthreadcomm;

class Account1 {
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
		notifyAll();
	}
}

public class AccountInterthreadcomm2 {

	public static void main(String[] args) {
		Account a1 = new Account();
		Thread son = new Thread() {
			public void run() {
				a1.withdraw(3000);
			}

		};
		son.setName("Son");
		Thread daughter =new Thread()
				{
			public void run()
			{
				a1.withdraw(1000);
			}
				};
			daughter.setName("daughter");
			
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
		daughter.start();
		Father.start();
		mother.start();
	}

}
