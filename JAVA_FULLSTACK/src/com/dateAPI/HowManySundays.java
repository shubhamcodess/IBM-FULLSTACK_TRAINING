package com.dateAPI;

import java.time.LocalDate;

public class HowManySundays {

	public static void main(String[] args) {
		int year=1998;
		System.out.println("YEAR : "+year);
		LocalDate date=LocalDate.of(year, 1, 1);
		LocalDate endDate=LocalDate.of(year, 12, 31);
		String currDay = null;
		int count=0;
		String day="SUNDAY";
		do
		{
			currDay=date.getDayOfWeek().toString();
		
			if(currDay.equals(day))
				count++;
			date=date.plusDays(1);			
		}while(!date.equals(endDate));

		System.out.println(count+" "+day+"S in the year "+year);

	}

}
