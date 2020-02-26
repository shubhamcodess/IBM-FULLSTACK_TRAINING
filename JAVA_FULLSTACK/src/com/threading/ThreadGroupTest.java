package com.threading;


public class ThreadGroupTest implements Runnable{  
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) {  
      ThreadGroupTest runnable = new ThreadGroupTest();  
          ThreadGroup threadGroup = new ThreadGroup("Parent ThreadGroup");  
            
          Thread t1 = new Thread(threadGroup, runnable,"one");  
          t1.start();  
          Thread t2 = new Thread(threadGroup, runnable,"two");  
          t2.start();  
          Thread t3 = new Thread(threadGroup, runnable,"three");  
          t3.start();  
          System.out.println("Active Count : "+threadGroup.activeCount());
          System.out.println("Thread Group Name: "+threadGroup.getName()); 
          System.out.println("max Priority : "+threadGroup.getMaxPriority());
          System.out.println("Active Count : "+threadGroup.activeCount());
          
          
  
    }  
   }  
