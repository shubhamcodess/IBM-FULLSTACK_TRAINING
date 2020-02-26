package com.collections;

import java.util.HashMap;
import java.util.Map;

class Employee{
	int i;
	public Employee(int i) {
		super();
		this.i = i;
	}
	@Override
	public int hashCode()
	{
		return 1;
	}
	@Override
	public boolean equals(Object o)
	{
		return true;
	}
}
public class BehaviourCheck {

	public static void main(String[] args) {
		
		Map<Employee, String> ht = new HashMap<Employee, String>();
		ht.put(new Employee(5),"P");
		
		
		
	}

}
