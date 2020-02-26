package com.multithreading;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTankTemplate extends Frame {
	private static final long serialVersionUID = 1L;
	private int y=200;
	private int height=200;
	private int percent = 70;
	public WaterTankTemplate() {
		super("Ball game");
		setBackground(Color.GRAY);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getPercent() {
		return percent;
	}


	public void setPercent(int percent) {
		this.percent = percent;
	}


	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.BLUE);
		//g.fillRect(150, 200, 200, 200);
		g.fillRect(150, y, 200, getHeight());
		g.drawString(getPercent() + "%", 380, 200);
	}
	static WaterTankTemplate waterTank = new WaterTankTemplate();
	
	public static void main(String[] args) {
		
		waterTank.setSize(500, 500);
		waterTank.setVisible(true);
		waterTank.new WaterManagement("CONTROLLER");
		/*waterTank.new WaterManagement("INLET");
		waterTank.new WaterManagement("OUTLET");*/
	
}
	
	class WaterManagement implements Runnable {
		Thread t;
		
		public WaterManagement(String threadName) {
			t = new Thread(this, threadName);
			t.start();
		}
		@SuppressWarnings({ "deprecation" })
		public void run() {
			while(true) {
			if(Thread.currentThread().getName().equals("OUTLET")) {
				
					y = y + 5;
					height = height - 5;
					waterTank.setPercent(waterTank.getPercent()-5);
					waterTank.setHeight(height);
					repaint();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				
			}
			//-------------------------------
			else if(Thread.currentThread().getName().equals("INLET")) {
				
				y = y - 5;
				height = height +5;
				waterTank.setPercent(waterTank.getPercent()+5);
				waterTank.setHeight(height);
				repaint();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			
			
		}
		
			
			
			
			else if(Thread.currentThread().getName().equals("CONTROLLER")) {
				 
				 if(waterTank.getPercent()<=70) {
					 if(Thread.currentThread().getName().equals("INLET") )
						 Thread.currentThread().resume();
				 }
					 else
					 {
						 if(Thread.currentThread().getName().equals("OUTLET") )
							 Thread.currentThread().suspend();
					 }
						
					

			
		
		}
			
			}
		}
			
	}
}
	

					
				
		
	
