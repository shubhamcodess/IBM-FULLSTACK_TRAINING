package com.weeklytest3;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
class Producer{ //implements Runnable{
	static int x;
	 static Random rand=new Random();  //to generate random nos.
	 static int getRandom(){
	x=rand.nextInt(75);
	return x;
	}
	
}

class Consumer {//implements Runnable{
	static void printRand() {
	System.out.println("\t"+Producer.getRandom());
		//System.out.println(x);
	}
	
}
public class ProducerConsumerMultithreading {
	
	public static void main(String[] args) {
		ProducerConsumerMultithreading obj=new ProducerConsumerMultithreading();
		
		ReentrantLock lock=new ReentrantLock();
		final Producer producer=new Producer();
		final Consumer consumer=new Consumer();
		
		
		
		
		Runnable producerThread=()->{
			while(true) {
										lock.lock(); {
											try {
											System.out.println("Producer got the lock !!");
											producer.getRandom(); 
											System.out.println("Random integer produced");
											System.out.println("Producer going into sleep");
											Thread.sleep(500);
											System.out.println("Producer sleep over");
											} catch (InterruptedException e) {
												
												e.printStackTrace();
											}
											finally {
												lock.unlock();
											}
											
											
										}
							
			}
							};         //producer - Thread(1)
		Runnable consumerThread=()->{
			while(true) {
			lock.lock(); {
				try {
				System.out.println("\tConsumer got the lock !!");
				Consumer.printRand(); 
				System.out.println("\tRandom integer printed");
				System.out.println("\tConsumer going into sleep");
				Thread.sleep(200);
				System.out.println("\tConsumer sleep over");
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				finally {
					lock.unlock();
				}
				
				
			}
			}	
							
							};			//consumer -Thread(2)
							new Thread(producerThread).start();
							new Thread(consumerThread).start();
			
							
		
		

	}

}

