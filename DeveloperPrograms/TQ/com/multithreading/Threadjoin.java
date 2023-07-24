package com.multithreading;

public class Threadjoin extends Thread {

	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"----->"+i);
			try
			{
				Thread.sleep(400);
				
			}catch(InterruptedException e)
			{
			e.printStackTrace();	 
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
    Threadjoin t1=new Threadjoin();
    Threadjoin t2=new Threadjoin();
    Threadjoin t3=new Threadjoin();
    
	
	t1.start();
    t1.join();
    t2.start();
    t2.join();
    t3.start();
    t3.join();
    
	
	
	
	}

}
