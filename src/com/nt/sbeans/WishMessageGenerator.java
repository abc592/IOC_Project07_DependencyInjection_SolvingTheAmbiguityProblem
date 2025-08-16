package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
    private LocalTime time;
    private LocalDate date;
    private int age;
    private String email;
    
    //ConstructorInjection
    public WishMessageGenerator(LocalTime time, LocalDate date, int age, String email) {
    	System.out.println("WishMessageGenerator.WishMessageGenerator()");
        this.time = time;
        this.date = date;
        this.age = age;
        this.email = email;
    }

	//setter method for setter Injection
//	public void setTime(LocalTime time) {
//		this.time=time;
//	}
	// develop the b.method
	
	public String showWishMessage(String user) {
		//get current hour of the day
		System.out.println("WishMessageGenerator.showWishMessage1()::"+time+"...."+date+"...."+age+"...."+email);
		int hour = time.getHour();
		if(hour<12)
			return "Good Morning::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
	}
	
	
}
