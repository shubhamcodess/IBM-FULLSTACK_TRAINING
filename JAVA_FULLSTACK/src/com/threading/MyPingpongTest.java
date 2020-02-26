package com.threading;

public class MyPingpongTest implements Runnable {

	Thread t1,t2,t3;
	public MyPingpongTest()
	{	t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t1.setName("PING");
		t2.setName("PONG");
		t3.setName("TONG"); //we hill make it daemon thread
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
	
	@Override
	public void run() {
	
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().contentEquals("PING"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("PING");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().contentEquals("PONG"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("\tPONG");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		else
		{
			while(true)
			{
				System.out.println("\t\tTONG");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}


	public static void main(String[] args) {
		
		new MyPingpongTest();
	}

}
