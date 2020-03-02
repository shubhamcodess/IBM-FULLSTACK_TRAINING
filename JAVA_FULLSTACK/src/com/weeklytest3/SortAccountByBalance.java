package com.weeklytest3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

class Account{
	private int id;
	String name;
	double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
public class SortAccountByBalance {

	public static void main(String[] args) {
		  Consumer<Account> consumer= (Account s)-> System.out.println(s);
		    
		
		
		Comparator<Account> comp =(Account a1, Account a2)->{
			
			if(a1.getBalance()<a2.getBalance())
				return 1;
			else if(a1.getBalance()==a2.getBalance())
				return 0;
			else
				return -1;

};
		
		
		
		
		TreeSet<Account> accountSet =  new TreeSet<Account>(comp);
		accountSet.add(new Account(1,"SHUBHAM",50000.55));
		accountSet.add(new Account(2,"BATMAN",53524.55));
		accountSet.add(new Account(3,"ROBIN",43524.75));
		accountSet.add(new Account(1,"CLARK",95005.15));
		

		
		
		
		Iterator itr=accountSet.iterator();
	
		while(itr.hasNext())
		{
			Account t=(Account) itr.next();
			consumer.accept((Account) t);
		}
		
	}	

	}


