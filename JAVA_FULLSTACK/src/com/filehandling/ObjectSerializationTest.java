package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Date implements Serializable{
	int day;

	public Date(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + "]";
	}
		
}
class Account implements Serializable{
	private static final long serialVersionUID = 100;
	private String name;
	private int accno;
	private transient String pwd;
	Date d;
	public Account(String name, int accno, String pwd,int d) {
		super();
		this.name = name;
		this.accno = accno;
		this.pwd = pwd;
		this.d=new Date(d);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", accno=" + accno +", date="+ d +"]";
	}
	
	
}


public class ObjectSerializationTest {
	
	
	
	
	
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		File file = new File("C:\\Users\\Win10\\git\\IBM-FULLSTACK_TRAINING\\JAVA_FULLSTACK\\accounts.txt");
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(new Account("DANVERS",12345,"hello",15));
		System.out.println("Object Serialized");
		
		FileInputStream fin = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fin);
		Account account = (Account)in.readObject();
		System.out.println("Account = " + account);
		
		
		
		
		out.flush();
		out.close();
		in.close();
	}
	

}
