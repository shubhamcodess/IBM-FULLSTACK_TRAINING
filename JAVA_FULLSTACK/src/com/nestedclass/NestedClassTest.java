package com.nestedclass;

import java.util.*;

class MyApp
{
	 class Cache{
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		
	}
	MyApp.Cache c=new MyApp.Cache();
	public void addData(Integer key,String value)
	{
		
		c.data.put(key,value);
		
	}
	
	public void getData(int key)
	{
		System.out.println("Value: "+c.data.get(key));
	}
	
}

public class NestedClassTest
{
	public static void main(String[] args){
		MyApp c=new MyApp();
		c.addData(1,"FROOTI");
		c.addData(2,"COCA-COLA");
		c.addData(3,"MOUNTAIN DEW");
		
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter the Key value : ");
			Scanner sc=new Scanner(System.in);
			int k;
			k=sc.nextInt();
			c.getData(k);
		}
		
		
	}
}