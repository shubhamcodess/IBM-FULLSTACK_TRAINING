package com.interfacee;
import com.classobject.Date;
class Employee2 implements Cloneable
{
	Date dob;
	public Date getDob()
	{
		return dob;
	}
	public void setDob(Date dob)
	{
		this.dob=dob;
	}
	
	public Object clone() //throws CloneNotSupportedException
	{
	
		try{
			Employee2 cloned =(Employee2)super.clone();
			cloned.setDob((Date)this.getDob().clone());
			return cloned;
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
			return null;
		}
	
}
public Employee2(Date dob)
		{
			this.dob=dob;
		}

public String toString()
{
	return "Dob = "+this.dob;
}
}
public class CloneTest
{
	public static void main(String args[])
	{
		Employee2 e1=new Employee2(new Date(14,5,2025));
		Employee2 e2=(Employee2)e1.clone();
		//e2.setDob((Employee2)e2.getDob().clone());
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("Shallow : "+(e1.getDob()==e2.getDob()));
	}
}