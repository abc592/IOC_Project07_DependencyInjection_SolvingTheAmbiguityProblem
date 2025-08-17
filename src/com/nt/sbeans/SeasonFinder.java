package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
    private LocalDate date;
    @Autowired
    public void setDate(LocalDate date) {
        System.out.println("SeasonFinder.setDate()");
        this.date = date;
    }
    
    public String showSeasonName() {
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

