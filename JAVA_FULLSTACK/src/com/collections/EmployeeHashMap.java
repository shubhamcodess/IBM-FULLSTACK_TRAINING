package com.collections;
//import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Date {
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	private int day;
	private int month;
	@SuppressWarnings("unused")
	private int year;
	public Date(int day, int month, int year) {
	
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public int hashCode()
	{
		return 25;
	}
	
	@Override
	public boolean equals(Object o) {
		Date dt=(Date) o;
		if(dt.day==this.day&&dt.month==this.month)
			return true;
		else return false;
	}
}
public class EmployeeHashMap {

	public static void main(String[] args) {
		Map<Date, String> ht = new HashMap<Date, String>();
		Date d[]=new Date[6];
		d[0]=new Date(1,2,1998);
		d[1]=new Date(10,5,2002);
		d[2]=new Date(1,2,1998);
		d[3]=new Date(15,2,2002);
		d[4]=new Date(11,2,1998);
		d[5]=new Date(11,2,1998);
		ht.put(d[0], "SHUBHAM");
		ht.put(d[1], "ROBIN");
		ht.put(d[2], "CHARLIE");
		ht.put(d[3], "NAMAN");
		ht.put(d[4], "PARV");
		ht.put(d[5], "SAI");
		
		//---------------------------------
		/*ht.forEach((k, v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
		});*/
		//---------------------------------------
	/*	for(int i=0;i<5;i++)
		{
				String name = ht.get(d[i]);
			System.out.println(name);
			
		}*/
		//---------------------------------------
		Iterator<Date> itr = ht.keySet().iterator();
		int i=0;
		while(itr.hasNext())
		{
			Date n=itr.next();
		
			System.out.println(n+" Name : "+ht.get(n));
		}

	}

}
