

package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest implements Runnable {
	Thread t1,t2;
	public CopyOnWriteArrayListTest() {
	t1=new Thread(this);
	t2=new Thread(this);
	t1.setName("ADD");
	t2.setName("ITERATE");
	
	t1.start();
	t2.start();
	t2.setPriority(1);
	//t2.setDaemon(true);
	
	}
	static CopyOnWriteArrayList<Integer> arrList =new CopyOnWriteArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println("Starting..");
		new CopyOnWriteArrayListTest();
		//System.out.println("Ending..");
	}

	@Override
	public void run() {
		if(Thread.currentThread().getName().contentEquals("ADD"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Adding "+i);
				arrList.add(i);
				System.out.println("Added "+i);
				System.out.println("Sleeping for 1 sec");
				try {
					System.out.println("Inside ADD THREAD TRY");
					Thread.sleep(450);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Slept for 1 sec");
				
			}
		}
		
		else if(Thread.currentThread().getName().contentEquals("ITERATE"))
		{
			System.out.println("\tInside ITERATE THREAD ");
			Iterator<Integer> itr = arrList.iterator();
			while(itr.hasNext()) {
				int n = itr.next();
				System.out.println("\t  Printing : "+n);
				try {
					System.out.println("\tInside ITERATE THREAD TRY");
					Thread.sleep(900);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\tSlept for 1 sec");
			}
			/*for(int i=0;i<arrList.size();i++) {
				
				System.out.println("\t  Printing : "+arrList.get(i));
				System.out.println("\tSleeping for 1 sec");
				try {
					System.out.println("\tInside ITERATE THREAD TRY");
					Thread.sleep(600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("\tSlept for 1 sec");
			}*/
		}
	}
}
