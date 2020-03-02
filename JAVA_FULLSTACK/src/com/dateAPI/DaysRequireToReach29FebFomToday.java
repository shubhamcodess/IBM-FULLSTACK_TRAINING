package com.dateAPI;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

@FunctionalInterface
interface TemporalAdjuster { Temporal adjustInto(Temporal temporal); }

class NextWorkingDay implements TemporalAdjuster 
{
	public  Temporal adjustInto(Temporal temporal) 
	{
		//LocalDate today=LocalDate.now();
		LocalDate today = LocalDate.of(2020, 02, 18);
		int leapYearFinder=today.getYear();
		//System.out.println(leapYearFinder);
		int count = 0;
		//sSystem.out.println(today.getMonthValue());
		/*boolean togo=false;
		int x=isLeap(today.getYear());
		if(x==1) 
			togo=true;
		else
			togo=false; */
		if(today.getMonthValue()<3 && today.isLeapYear()) {
		while(isLeap(leapYearFinder)!=1 )
		{
			leapYearFinder+=1;
			
			count++;
			System.out.println(leapYearFinder);
		}
		System.out.println(leapYearFinder);
		System.out.println(count);
		
	LocalDate theLeapyear=today.plusYears(count);
	System.out.println("TODAY : "+today);
	theLeapyear=LocalDate.of(leapYearFinder, 02, 29);
	//System.out.println(theLeapyear);
	Period p=Period.between(theLeapyear,today);
	System.out.println(p+" days to the next 29th February in the year "+leapYearFinder);
		//return temporal;
		}
		else
		{
			//System.out.println("In else block");
		/*	
			do
			{
				leapYearFinder+=1;
				
				count++;
				//System.out.println(leapYearFinder);
			}while(today.isLeapYear() ==false);
			//System.out.println(leapYearFinder);
			System.out.println(count);
			*/
		LocalDate theLeapyear=today.plusYears(4);
		System.out.println("TODAY : "+today);
		theLeapyear=LocalDate.of(theLeapyear.getYear(),02,29);
		//System.out.println(theLeapyear);
		Period p=Period.between(today,theLeapyear);
		System.out.println(p+" days to the next 29th February in the year "+theLeapyear.getYear());
		//System.out.println("end of  else block");
		}
		
		return today;
		
	}

	private int isLeap(int leapYearFinder) {
		
		 if (((leapYearFinder % 4 == 0) && (leapYearFinder % 100!= 0)) || (leapYearFinder%400 == 0))
			 return 1;
		 else
			 return 0;
					 
}
}

public class DaysRequireToReach29FebFomToday {

	public static void main(String[] args) {
		NextWorkingDay n=new NextWorkingDay();
		//LocalDate today = LocalDate.of(2020, 02, 18);
		LocalDate today=LocalDate.now();
		Temporal t=n.adjustInto(today);
		//System.out.println("\t"+t);
		

		
		

	}

}
