package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example5 {

	public static void main(String[] args) {
//String x="16-05-2022 15:52";
//DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
//LocalDateTime l=LocalDateTime.parse(x,df);
DateTimeFormatter df=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
LocalDateTime l=LocalDateTime.now();
String x=l.format(df);

		//System.out.println(l);
System.out.println(x);

		
	}

}
