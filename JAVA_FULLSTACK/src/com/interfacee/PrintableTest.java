package com.interfacee;

interface Printable{
	void print();
}
class Employee implements Printable
{
	public void print()
	{
		System.out.println("Employee details are currently being printed...");
	}
}
class Circle implements Printable
{
	public void print()
	{
		System.out.println("A circle is being drawn...");
	}
}
 
 public class PrintableTest
 {
	 public static void printAll(Printable p[])
	 {
		for(int i=0;i<p.length;i++)
		{
			p[i].print();
		}
			
	 }
	 public static void main(String args[])
	 {
		  Printable p[]=new Printable[2];
		 p[0]=new Circle();
		 p[1]=new Employee();
		
		 PrintableTest.printAll(p);
	 }
	 
 }
		
	