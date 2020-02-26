package com.threading;

public class MyPingPongExtends extends Thread {

	Thread t1,t2;
	public MyPingPongExtends(String threadName)
	{
		super.setName(threadName);
		super.start();
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
		else
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
		
	}


	public static void main(String[] args) {
		
		new MyPingPongExtends("PING");
		new MyPingPongExtends("PONG");
		
	}

}
