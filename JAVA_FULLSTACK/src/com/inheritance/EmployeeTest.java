package com.inheritance;

class Employee
{
	private double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.salary=salary;
	}
	
	public double getSal()
	{
		return salary;
	}
}
class Manager extends Employee{
	private double incentive;
	public Manager(int id,String name,double salary,double incentive)
	{
		super(id,name,salary);
		this.incentive=incentive;
	}
	public double getSal()
	{
		return super.getSal() + this.incentive;
	}
	
}

class Labour extends Employee{
	private double overtime;
	public Labour(int id,String name,double salary,double overtime)
	{
		super(id,name,salary);
		this.overtime=overtime;
	}
	public double getSal()
	{
		return super.getSal() + this.overtime;
	}
	
}

public class EmployeeTest
{
	public static double getTotalSalaryOfAllEmployee(Employee e[])
	{
		double sal=0.0;
		for(int i=0;i<e.length;i++)
		{
			sal+=e[i].getSal();
		}
		return sal;
	}
	public static void main(String args[])
	{
		Employee e[]=new Employee[4];
		e[0]=new Manager(1,"ABC",10000,2000);
		e[1]=new Manager(2,"DEF",12000,1000);
		e[2]=new Labour(3,"GHI",5000,2000);
		e[3]=new Labour(4,"JKL",8000,1500);
		
		double totalSalary=getTotalSalaryOfAllEmployee(e);
		System.out.println("Total Salary Of All Emplyee is : "+totalSalary);
	}
}