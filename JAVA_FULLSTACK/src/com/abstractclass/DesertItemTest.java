package com.abstractclass;

import java.util.*;
abstract class DesertItem{
	abstract double getCost();
}
class Candy extends DesertItem
{
	private int storage;
	private int tax;
	private double cost;
	public Candy()
	{
		this.storage=10;
		this.tax=3;
		this.cost=15;
	}
	
	public double getCost()
	{
		return  ( this.cost + (( this.cost * this.tax)/100) )*60;
	}
	public int getStorage()
	{
		return this.storage;
	}
	 public void setStorage(int n)
	 {
		 storage+=n;
	 }
}

class Cookie extends DesertItem
{
	private int storage;
	private double tax;
	private double cost;
	public Cookie()
	{
		this.storage=10;
		this.tax=3.5;
		this.cost=10;
	}
	public double getCost()
	{
		return  (this.cost + (( this.cost * this.tax)/100) )*70;
	}
	
	public int getStorage()
	{
		return this.storage;
	}
	 public void setStorage(int n)
	 {
		 storage+=n;
	 }
}

class Icecream extends DesertItem
{
	private int storage;
	private int tax;
	private double cost;
	public Icecream()
	{
		this.storage=10;
		this.tax=2;
		this.cost=50;
	}
	public double getCost()
	{
		return  this.cost + (( this.cost * this.tax)/100);
	}
	public int getStorage()
	{
		return this.storage;
	}
	 public void setStorage(int n)
	 {
		 storage+=n;
	 }
}

public class DesertItemTest
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.print("Are You ? 1:Owner  2:Customer  : ");
		choice=sc.nextInt();
		Candy c=new Candy();
			Cookie c1=new Cookie();
			Icecream c2=new Icecream();
		if(choice==1){
			
				System.out.println("Welcome Owner");
				System.out.println("Which desert item You Wish To Increse The Storage :  1:Candy  2:Cookie  3:Icecream ");
				int desertOption=0;
				desertOption=sc.nextInt();
				System.out.print("How Much unit you want to add to the Storage : ");
				int capacity=0;
				capacity=sc.nextInt();
				switch(desertOption)
				{
					case 1: c.setStorage(capacity);break;
					case 2: c1.setStorage(capacity);break;
					case 3: c2.setStorage(capacity);break;
					
				}
				System.out.println("Current Inventory Scenario : ");
				System.out.println("Candy : "+c.getStorage());
				System.out.println("Cookie : "+c1.getStorage());
				System.out.println("IceCream : "+c2.getStorage());
		}
		
		if(choice==2)
		{
			System.out.println("Welcome Customer");
			System.out.println("Which desert item You Wish To Order Today : 1:Candy  2:Cookie  3:Icecream : ");
			int desertOption=0;
				desertOption=sc.nextInt();
				System.out.print("How Much unit you want to Order : ");
				int capacity=0;
				capacity=sc.nextInt();
				
				if(desertOption==1)
				{
					if(capacity>c.getStorage())
					{
						int temp=c.getStorage();
						System.out.println("Opps We are Running Out of candy Storage ");
						System.out.println("We can only place order for "+temp+"candy");
						int cap=-capacity;
						c.setStorage(cap);
						
						double bill=capacity*c.getCost();
						System.out.print("Total bill is : "+temp+" candies "+bill+" Rupees");
					}
					
					else if(c.getStorage()==0)
					{
						System.out.println("Opps Nothing in inventory");
						
					}
						
					else
					{
						System.out.println(" placing order for "+capacity+"candy");
						int cap=capacity;
						c.setStorage(cap);
						
						double bill=capacity*c.getCost();
						System.out.print("Total bill is : "+capacity+" candies "+bill+" Rupees");
					}
				}
				
				if(desertOption==2)
				{
					if(capacity>c1.getStorage())
					{
						int temp=c1.getStorage();
						System.out.println("Opps We are Running Out of Cookie Storage ");
						System.out.println("We can only place order for "+temp+"Cookie");
						int cap=-capacity;
						c1.setStorage(cap);
						
						double bill=capacity*c1.getCost();
						System.out.print("Total bill is : "+temp+" cookies "+bill+" Rupees");
					}
					else if(c1.getStorage()==0)
					{
						System.out.println("Opps Nothing in inventory");
						
					}
						
					else
					{
						System.out.println(" placing order for "+capacity+"Cookie");
						int cap=capacity;
						c1.setStorage(cap);
						
						double bill=capacity*c1.getCost();
						System.out.print("Total bill is : "+capacity+" cookies "+bill+" Rupees");
					}
					
				}
				
				
				if(desertOption==3)
				{
					if(capacity>c2.getStorage())
					{
						int temp=c2.getStorage();
						System.out.println("Opps We are Running Out of Icecream Storage ");
						System.out.println("We can only place order for "+temp+"Icecream");
						int cap=-capacity;
						c2.setStorage(cap);
						
						double bill=capacity*c2.getCost();
						System.out.print("Total bill is : "+temp+" candies "+bill+" Rupees");
					}
					else if(c2.getStorage()==0)
					{
						System.out.println("Opps Nothing in inventory");
					
					}
						
						
					else
					{
						System.out.println(" placing order for "+capacity+"Icecream");
						int cap=capacity;
						c2.setStorage(cap);
						
						double bill=capacity*c2.getCost();
						System.out.print("Total bill is : "+capacity+" Icecream "+bill+" Rupees");
					}
				}
		}
	}
}	
						
			
			
				