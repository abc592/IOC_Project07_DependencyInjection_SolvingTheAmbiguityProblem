package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wx")
//@Qualifier("ldate2")
public class WeekDayFinder {
	@Autowired
	@Qualifier("ldate")
	private LocalDate date;
	public WeekDayFinder() {
		System.out.println("WeekDayFinder.WeekDayFinder():0-parm");
	}
	
	//for constructor inject
	@Autowired
	public WeekDayFinder(@Qualifier("ldate1")LocalDate date) {
		this.date=date;
		
	}
	
	//for setter injection
	@Autowired
	@Qualifier("ldate2")
	public void setDate(LocalDate date) {
		System.out.println("WeekDayFinder.setDate()");
		this.date=date;
	}
	
	//for arbitrary method injection
	@Autowired
	@Qualifier("ldate3")
	public void putData(LocalDate date) {
		System.out.println("WeekDayFinder.putData()");
		this.date=date;
		
	}
	public String showGreetMessage(String name) {
		System.out.println("WeekDayFinder.showGreetMessage()"+date);
		int week =date.getDayOfWeek().getValue();
		if(week!=6 && week!=7)
			return "Happy Working Day,Working is Worshipping::"+name;
		else
			return "Happy Weekend, Enjoy your paid Holiday " +name;
	}

}
