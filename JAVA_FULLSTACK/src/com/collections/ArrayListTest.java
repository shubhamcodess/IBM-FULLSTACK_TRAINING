package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	public static void main(String args[])
	{
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("x");
		arrayList.add("r");
		arrayList.add("t");
		arrayList.add("a");
		arrayList.add("e");
		arrayList.add("z");
		
		ListIterator<String> itr = arrayList.listIterator(arrayList.size());
		while(itr.hasPrevious()) {
			String name = itr.previous();
			System.out.println(name);
		}
}
}

