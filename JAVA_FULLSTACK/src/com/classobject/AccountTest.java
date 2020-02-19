package com.classobject;

class Account{
	private int accId;
	private String accname;
	private long balance;
	public Account(int balance,int accId, String name)
	{
		this.balance=balance;
		this.accId=accId;
		this.accname=name;
	} 	
	public int getId()
	{
		return accId;
	}
	public long getBalance()
	{
		return balance;
	}
	public String getName()
	{
		return accname;
	}
	public void setId(int accId)
	{
		this.accId=accId;
	}
	public void setBalance(long balance)
	{	
		this.balance=balance;
	}
	public void setName(String accname)
	{
		this.accname=accname;
	}
	
	public void deposit(long sum)
	{
		this.balance+=sum;
	}
	public void withdraw(long sum)
	{
		if(sum>0 && sum<this.balance)
			this.balance-=sum;
	}
	
	
	public String toString()
{
	return "Name : "+this.getName()+"\nID: "+this.getId()+"\nBalance : "+getBalance();
}
	}
	
	
	public class AccountTest{
		public static void main(String args[])
		{
			Account a1=new Account(16000,1641017079,"SHUBHAM");
			a1.deposit(1250);
			System.out.println(a1);
		}
	}
			
			
			
			