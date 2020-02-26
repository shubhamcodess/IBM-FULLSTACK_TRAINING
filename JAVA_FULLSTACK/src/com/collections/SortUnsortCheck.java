package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortUnsortCheck {

	public static void main(String[] args)
	{
			//HashSet Implementation
		//----------------------------------------------------------
		Set<String> hset = new HashSet<String>();
		hset.add("B");
		hset.add("R");
		hset.add("A");
		hset.add("C");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
			
			
		}
		System.out.println("Thus HashSet is UnOrdered !!\n");
		
		
				//LinkedHashSet implementation
		//-----------------------------------------------------------------
		
		LinkedHashSet<String> linkedset =  new LinkedHashSet<String>(); 
		
		linkedset.add("B");
		linkedset.add("R");
		linkedset.add("A");
		linkedset.add("C");
		

		Iterator<String> itr2 = linkedset.iterator();
		while(itr2.hasNext()) {
			String name = itr2.next();
			System.out.println(name);
			
			
		}
		System.out.println("Thus LinkedHashSet is Ordered !!\n\n");
		//------------------------------------------------------------------
	
	}

}
