package com.classobject;

import java.util.*;
class QueueArray{
	private int queue[];
	public QueueArray(int queue[])
	{
	this.queue=queue;
	}
	public boolean push(int num){
		queue[getTop()]=num;
		return true;
	}
	public int pop()
	{   int val=queue[0];
		for(int i=0;i<queue.length-1;i++)
		{
		
			 queue[i]=queue[i+1];
		}
		//queue.length--;
		return val;
	}
	private int getTop()
	{
		for(int i=0;i<queue.length-1;i++){
			if(queue[i]==0){
			return i;}
		}
		return -1;
	}
	
	public void printqueue()
	{
		for(int i=getTop()-1;i>=0;i--)
		{
			System.out.print(queue[i]+"<-");
		}
	}
}
public class QueueTest
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		QueueArray a1=new QueueArray(new int[10]);
		int ans=1;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("1:Push   2:Pop  3:Print");
		int ch=sc.nextInt();
		int num=0;
		switch(ch)
		 {
			case 1:System.out.print("Enter number to be pushed : ");
			num=sc.nextInt();
			a1.push(num); break;
			
			case 2:System.out.println("Number being popped is : ");
			int temp=a1.pop();
			System.out.println(temp);
			break;
			
			case 3:System.out.println("Printing queue...");a1.printqueue();break;
			
			default:System.out.print("Incorrect option");
		 }
		System.out.print("Wish to continue ? (Y:1  N:0)  : ");
		ans=sc.nextInt();
		}while(ans==1);
	}
}
		
		
	