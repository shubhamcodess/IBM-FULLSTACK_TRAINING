package com.generics;

import java.util.HashMap;
import java.util.Map;

 class Date1 {
	private int day,month,year;

	public Date1(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "[day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}

public class PrinthashMapKeyValuesTest {
	
	
	public static void main(String[] args) {
		Map<Integer,String> myHashMap=new HashMap<Integer,String>();
		System.out.println("For Ineteger KEY  and String VALUE\n");
		myHashMap.put(1,"HELLO");
		myHashMap.put(2,"HII");
		myHashMap.put(3,"BYE");
		printhashMapKeyValues(myHashMap);
		System.out.println("\n\nFor Double KEY  and DateType VALUE\n");
		Map<Double,Date1> myHashMap2=new HashMap<Double,Date1>();
		myHashMap2.put(1.14,new Date1(14,02,1998));
		printhashMapKeyValues(myHashMap2);
		myHashMap2.put(1.14,new Date1(17,12,2014));
		printhashMapKeyValues(myHashMap2);
	}

	private static void printhashMapKeyValues(Map<? extends Number , ? > myHashMap) {
		for (Number name : myHashMap.keySet()) {
		    System.out.println("Key : "+name + "  Value: "+myHashMap.get(name)) ;
		}
		
	}

	

}
