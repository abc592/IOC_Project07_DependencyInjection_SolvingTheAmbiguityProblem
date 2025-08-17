package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wx")
public class WeekDayFinder {
	
	@Autowired
	private LocalDate date;
	public WeekDayFinder() {
		System.out.println("WeekDayFinder.WeekDayFinder():0-parm");
	}
	public String showGreetMessage(String name) {
		System.out.println("WeekDayFinder.showGreetMessage()");
		int week =date.getDayOfWeek().getValue();
		if(week!=6 && week!=7)
			return "Happy Working Day,Working is Worshipping::"+name;
		else
			return "Happy Weekend, Enjoy your paid Holiday " +name;
	}

}
