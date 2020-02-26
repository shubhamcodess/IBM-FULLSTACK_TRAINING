package com.collections;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Date //implements //Comparable<Date>
{
	private int day,  month, year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	

	/*@Override
	public int compareTo(Date d) {
		Integer retVal=0;
		// TODO Auto-generated method stub
		if (this.day!=d.getDay()&&this.month!=d.getMonth())
		{
			if(this.day<d.getDay())
				retVal=1;
			else if(this.day>d.getDay())
				retVal=-1;
			else if(this.day==d.getDay())
			{
				if(this.month<d.getMonth())
					retVal=1;
				else if(this.month<d.getMonth())
					retVal=-1;
				else if(this.month==d.getMonth())
					retVal=0;
			}
		}
		return retVal;
	}*/
	
	@Override

	public boolean equals(Object obj) {
        Date o= (Date)obj;
		if(o.day==this.day&&o.month==this.month)
			return true;
		else 
			return false;
        
	}
	
//	@Override
    public int hashCode() {
        return 2;
    }
}

public class Dt {
	
	public static void main(String[] args) 
	{
		HashMap<Date, String> map = new HashMap<>();
		map.put(new Date(2, 1,1998), "mno");
		map.put(new Date(2, 1,1999), "abc");
		map.put(new Date(3, 1,1998), "xyz");
		map.put(new Date(3, 1,1998), "xyz");
		
       	
		map.forEach((k, v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
        });
		 String s=map.get(new Date(2, 1,1998));
		 System.out.println("call : "+s);
	
		
	}

}
