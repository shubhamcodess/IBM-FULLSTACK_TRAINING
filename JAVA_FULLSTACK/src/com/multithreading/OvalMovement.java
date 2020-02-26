package com.multithreading;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings("serial")
public class OvalMovement extends Frame implements Runnable {

	int y1 = 400, y2 = 400, y3 = 400;
	boolean b1Reached, b2Reached, b3Reached;
	ReentrantLock lock;
	Condition c;
	
	Thread t1, t2, t3;
	
	public OvalMovement() {
		
		super("Oval Game");
		lock=new ReentrantLock();
		c=lock.newCondition();
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		t1 = new Thread(this, "Ball_1");
		t2 = new Thread(this, "Ball_2");
		t3 = new Thread(this, "Ball_3");
		t1.start();t2.start();t3.start();
	}

	public void waitForOtherBalls() {
		
	lock.lock();
		try {
		if (b1Reached && b2Reached && b3Reached) {
			b1Reached = false;
			b2Reached = false;
			b3Reached = false;
			c.signalAll();
		
		}
		else {
			try {
				c.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
		finally {
			lock.unlock();
		}
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		
		if (currentThread.getName().equals("Ball_1")) {
			
			for(;;) {
				for(int i=400; i>100; i = i-5) {
					y1 = i;
					repaint();
					try { Thread.sleep(100); } catch(Exception e) {}
					if (i < 10)
						break;
				}
				b1Reached = true;
				waitForOtherBalls();
				for(int i=100; i<=400; i = i+5) {
					y1 = i;
					repaint();
					try { Thread.sleep(100); } catch(Exception e) {}
					if (i > 395)
						break;
				}
				b1Reached = true;
				waitForOtherBalls();
			}
		}
		//try end
		
		
		

		else if (currentThread.getName().equals("Ball_2")) {
			
			
			for(;;) {
				for(int i=400; i>100; i = i-5) {
					y2 = i;
					repaint();
					try { Thread.sleep(200); } catch(Exception e) {}
					if (i < 10)
						break;
				}
				b2Reached = true;
				waitForOtherBalls();
				for(int i=100; i<=400; i = i+5) {
					y2 = i;
					repaint();
					try { Thread.sleep(200); } catch(Exception e) {}
					if (i > 395)
						break;
				}
				b2Reached = true;
				waitForOtherBalls();
			}
			}

			
		
		else if (currentThread.getName().equals("Ball_3")) {
			
			
			for(;;) {
				for(int i=400; i>100; i = i-5) {
					y3 = i;
					repaint();
					try { Thread.sleep(300); } catch(Exception e) {}
					if (i < 10)
						break;
				}
				b3Reached = true;
				waitForOtherBalls();
				for(int i=100; i<=400; i = i+5) {
					y3 = i;
					repaint();
					try { Thread.sleep(300); } catch(Exception e) {}
					if (i > 395)
						break;
				}
				b3Reached = true;
				waitForOtherBalls();
			}
		}

			
		}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}
	
	public static void main(String args[]) {
		Frame om = new OvalMovement();
		om.setSize(600, 600);
		om.setBackground(Color.CYAN);
		om.setVisible(true);
	}
}