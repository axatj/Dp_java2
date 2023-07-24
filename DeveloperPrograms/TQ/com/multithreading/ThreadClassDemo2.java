package com.multithreading;

public class ThreadClassDemo2 extends Thread{
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"-> Thread is running "+Thread.currentThread().getPriority());
		
		
	}

	public static void main(String[] args) {
  ThreadClassDemo2 t1=new ThreadClassDemo2();
  t1.setName("Mythread");
  t1.setPriority(10);
  t1.start();
	
  ThreadClassDemo2 t2=new ThreadClassDemo2();
   t2.setName("UserThread");	
t2.setPriority(7);
t2.start();
	}

}
