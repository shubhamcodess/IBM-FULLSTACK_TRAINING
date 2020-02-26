package com.multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OvalGameTest extends Frame implements Runnable{
	private static final long serialVersionUID = 1L;
	int y1 = 400, y2 = 400, y3 = 400;
	Thread t1,t2,t3;
	public OvalGameTest() {
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
		Frame mf = new OvalGameTest();
		mf.setSize(500, 500);
		mf.setVisible(true);
		
	
}
	@Override
	public void run() {
		
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
			}	
			
		}
		
		
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
			}
		
		
		}
		
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
		
		
		}
	}
	}
}

