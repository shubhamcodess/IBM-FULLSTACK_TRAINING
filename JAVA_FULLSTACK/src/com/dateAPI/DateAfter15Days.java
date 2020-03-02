package com.dateAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class DateAfter15Days {

	public static void main(String[] args) {
	LocalDate localdate = LocalDate.now();
	System.out.println(localdate);
	LocalDate local2=LocalDate.of(localdate.getYear(), localdate.getMonth().getValue(), localdate.getDayOfMonth()+15);
	System.out.println(local2+"  "+local2.getDayOfWeek() );
	}

}
