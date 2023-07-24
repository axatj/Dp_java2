package com.multithreading;

public class ThreadInterruptedDemo extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		if(Thread.interrupted())
		{
			System.out.println(Thread.currentThread().getName()+"--->Interrupted"+i);
			
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"----->Normal"+i);
			
		}
		
	}
	}
	public static void main(String[] args) {
		 ThreadInterruptedDemo t1=new ThreadInterruptedDemo();
		 t1.start();
		// t1.interrupt();
	}

}
