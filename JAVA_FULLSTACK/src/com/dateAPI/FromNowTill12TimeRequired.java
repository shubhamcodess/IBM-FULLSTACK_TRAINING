package com.dateAPI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FromNowTill12TimeRequired {

	public static void main(String[] args) {
		LocalDateTime localTime=LocalDateTime.now();
		//LocalTime localTime=LocalTime.of(07, 00);
		System.out.println("Curent Time : "+localTime.getHour() +":"+localTime.getMinute()+":"+localTime.getSecond());
		if(localTime.getHour()>12)
		{
			LocalDateTime nextDay;
			nextDay=localTime.plusDays(1);
			//System.out.println(nextDay);
			nextDay=LocalDateTime.of(nextDay.getYear(), nextDay.getMonthValue(), nextDay.getDayOfMonth(), 12, 00);
			//System.out.println(nextDay);
			Duration d=Duration.between( nextDay,localTime);
			System.out.println(d);
					
			

	}
		else {
			LocalTime afterTime=LocalTime.of(12, 00);
			Duration d2=Duration.between(localTime, afterTime);
			System.out.println(d2);
			
		}
	
	}

}
