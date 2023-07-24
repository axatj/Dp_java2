package com.multithreading;

public class RunnableSleepInterface  implements Runnable{
	
	@Override
	public void run() {
	 for(int i=1;i<=5;i++)
	 {
		 System.out.println(Thread.currentThread().getName()+" ---- >"+i);
		 try
		 {
			 Thread.sleep(300);
			 
		 }catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
	 }
	}

	public static void main(String[] args) {
	RunnableSleepInterface rsi=new RunnableSleepInterface();
	RunnableSleepInterface rsi2=new RunnableSleepInterface();
    Thread t1;
    t1=new Thread(rsi);
    t1.start();
    
     t1=new Thread(rsi2);
     t1.start();
     
	}

	

}
