package com.threading;


class PingPongAnnonymous
{ 
	public static void main(String[] args) 
	{ 
	//---------------------------------------     Annonymous inner class 1
		Runnable r1 = new Runnable()
		{ 
			public void run() 
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
		}; 
		Thread t = new Thread(r1); 
		t.start(); 
		//System.out.println("PING"); 
	//-----------------------------------------		Annonymous inner class 2
		Runnable r2=new Runnable()
		{ 
			public void run() 
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
		}; 
		Thread t1 = new Thread(r2); 
		t1.start(); 
		//System.out.println("PING"); 
	//---------------------------------------------
	} 
} 




