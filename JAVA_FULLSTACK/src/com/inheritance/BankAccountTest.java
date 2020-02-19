package com.inheritance;

class Account{
	private double initialbalance;
	
	public Account(double initialbalance)
	{
		this.initialbalance=initialbalance;
	}
	public double getBalance()
	{
		return this.initialbalance;
	}
	
}

class Savings extends Account{
	private double fd;
	
	public Savings(double initialbalance,double fd)
	{
		super(initialbalance);
		this.fd=fd;
	}
	
	public double getBalance()
	{
		return super.getBalance()+this.fd;
	}
}

class Current extends Account{
	private double cc;
	
	public Current(double initialbalance,double cc)
	{
		super(initialbalance);
		this.cc=cc;
	}
	
	public double getBalance()
	{
		return super.getBalance()+this.cc;
	}
}

public class BankAccountTest
{
	public static double getTotalAccountBalance(Account a[])
	{
		double bal=0.0;
		for(int i=0;i<a.length;i++)
		{
			bal+=a[i].getBalance();
		}
		return bal;
	}
	public static void main(String args[])
	{
		Account a[]=new Account[4];
		a[0]=new Savings(10000,2000);
		a[1]=new Current(125000,1000);
		a[2]=new Current(500000,24500);
		a[3]=new Savings(80100,1500);
		
		double totalBalance=getTotalAccountBalance(a);
		System.out.println(totalBalance);
	}
}