package com.multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OvalGameSync extends Frame implements Runnable{
	private static final long serialVersionUID = 1L;
	int y1 = 400, y2 = 400, y3 = 400;
	Thread t1,t2,t3;
	public OvalGameSync() {
		super("Oval game");
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t1.setName("RED");
		t2.setName("GREEN");
		t3.setName("BLUE");
		t1.start();
		t2.start();
		t3.start();
		
		setBackground(Color.BLACK);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
	}	
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) {
		Frame mf = new OvalGameSync();
		mf.setSize(500, 500);
		mf.setVisible(true);
		
	
}
	public static volatile int counter=0;
	synchronized public static int updateCounter() {
		counter++;
		return counter;
	}
	@Override
	 public void run() {
		
		//------------------------------------------------------------------------------
		Thread ct=Thread.currentThread();
		
		if(ct.getName().equals("RED"))
		{
			
			while(true) {
			//System.out.println(y1);
			do
			{
				y1=y1-3;
				repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
		}
				
		}while(y1>50);
			//counter=0;
			if(updateCounter()<3)
			{
				waitMe();
			}
			else {
				
				notifyAllMe();
				
			}
			y1=50;
			do
			{
				y1=y1+3;
				repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
		}
				
		}while(y1<400);
			//updateCounter();
			
			}
			
			
			}	
			
		
		
		//------------------------------------------------------------------------------------------
		
		if(Thread.currentThread().getName().equals("GREEN"))
		{
			
			while(true) {
			//System.out.println(y1);
			do
			{
				y2=y2-3;
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
		}
				
		}while(y2>50);
			//counter=0;
			if(updateCounter()<3)
			{
				waitMe();
			}
			else {
				
				notifyAllMe();
				
			}
			y2=50;
			do
			{
				y2=y2+3;
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
		}
				
		}while(y2<400);
			//counter=0;
			//updateCounter();
			if(updateCounter()<3)
			{
				waitMe();
			}
			else {
				
				notifyAllMe();
				
			}
			}
		
		
		}
		//------------------------------------------------------------------------------------------------
		if(Thread.currentThread().getName().equals("BLUE"))
		{//System.out.println(y3);
			
			while(true) {
		do
		{
			y3=y3-3;
			repaint();
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
	}
			
	}while(y3>50);
		y3=50;
		//counter=0;
		if(updateCounter()<3)
		{
			waitMe();
		}
		else {
			
			notifyAllMe();
			 
		}
		
		do
		{
			y3=y3+3;
			repaint();
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
	}
			
	}while(y3<400);
		//updateCounter();
		//counter=0;
		if(updateCounter()<3)
		{
			waitMe();
		}
		else {
			
			notifyAllMe();
			
		}
		
		
		}
	}
		//--------------------------------------------------------------------------------------------
	}

	synchronized private void waitMe() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	synchronized private void notifyAllMe() {
		counter=0;
		notifyAll();
		
		
	}
}

