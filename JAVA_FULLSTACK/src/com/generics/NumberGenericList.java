package com.generics;

import java.util.ArrayList;
import java.util.List;
public class NumberGenericList {
public static void printGenericNumberList(List<? extends Number> list) {
	
	for(int i=0;i<list.size();i++)
	{
		System.out.print(list.get(i)+"  ");
	}
		
	}

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		printGenericNumberList(list);
		List<Float> list2=new ArrayList<Float>();
		list2.add(5.55f);
		printGenericNumberList(list2);
		



	}

}
