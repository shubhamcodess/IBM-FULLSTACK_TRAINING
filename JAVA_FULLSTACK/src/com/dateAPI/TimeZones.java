package com.dateAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeZones {

	public static void main(String[] args) {
		/*DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
		LocalDate date3 = LocalDate.now(); 
		String formattedDate_2 = date3.format(italianFormatter); 
		System.out.println(formattedDate_2);
		DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.FRENCH);
		LocalDate date5 = LocalDate.now();
		String formattedDate_3 = date5.format(frenchFormatter);
		System.out.println(formattedDate_3);
		DateTimeFormatter frenchFormatter1 = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMANY);
		LocalDate date51 = LocalDate.now();
		String formattedDate_31 = date51.format(frenchFormatter1);
		System.out.println(formattedDate_31);
		
		*/
		
		String formatter="MM/dd/yy";
		String frmt="hh:mm:ss";
		DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern(formatter, Locale.ENGLISH);
		LocalDateTime date5 = LocalDateTime.now();
		String formattedDate_3 = date5.format(frenchFormatter);
		System.out.println(formattedDate_3);

	}

}
