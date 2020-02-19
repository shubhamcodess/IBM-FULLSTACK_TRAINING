package com.classobject;

import java.util.*;
class StackedArray{
	private int stack[];
	public StackedArray(int stack[])
	{
	this.stack=stack;
	}
	public boolean push(int num){
		stack[getTop()]=num;
		return true;
	}
	public int pop()
	{
		int val=stack[getTop()-1];
		//System.out.println(val);
		stack[getTop()-1]=0;
		return val;
	}
	private int getTop()
	{
		for(int i=0;i<stack.length-1;i++){
			if(stack[i]==0){
			return i;}
		}
		return -1;
	}
	
	public void printStack()
	{
		for(int i=getTop()-1;i>=0;i--)
		{
			System.out.print(stack[i]+"<-");
		}
	}
}
public class StackTest
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		StackedArray a1=new StackedArray(new int[10]);
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
			
			case 3:System.out.println("Printing Stack...");a1.printStack();break;
			
			default:System.out.print("Incorrect option");
		}
		System.out.print("Wish to continue ? (Y:1  N:0)  : ");
		ans=sc.nextInt();
		}while(ans==1);
	}
}
		
		
	