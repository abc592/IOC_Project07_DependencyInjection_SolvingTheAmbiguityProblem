package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
//	@Autowired
    private LocalDate date; //field injection ---1st way
//	@Autowired
    private LocalTime time; //field injection
	
	
	//below code for setterinjection == 2nd way
    /*@Autowired
    public void setDate(LocalDate date) {
        System.out.println("SeasonFinder.setDate()");
        this.date = date;
    }
    
    @Autowired
    public void setTime(LocalTime time) {
        System.out.println("SeasonFinder.setTime()");
        this.time = time;
    }
    */
	
	//below code of arbitary methods for setterinjection --3rd way
	/*@Autowired
    public void assignDate(LocalDate date) {
        System.out.println("SeasonFinder.assignDate()");
        this.date = date;
    }
    
    @Autowired
    public void putTime(LocalTime time) {
        System.out.println("SeasonFinder.putTime()");
        this.time = time;
    }
    
    */
    
	private SeasonFinder() {
		System.out.println("SeasonFinder.SeasonFinder()::0 param");
	}
	//below code of ConstructorInjection ----4th way
	@Autowired
	private SeasonFinder(LocalDate date,LocalTime time) {
		System.out.println("SeasonFinder.SeasonFinder()::2 param");
		this.date=date;
		this.time=time;
	}
    public String showSeasonName() {
    	System.out.println("SeasonFinder.showSeasonName()"+date+"...."+time);
        int month = date.getMonthValue();

        if (month >= 3 && month <= 6) {
            return "Summer Season";
        } else if (month >= 7 && month <= 9) {
            return "Rainy Season";
        } else {
            return "Winter Season";
        }
    }
}

