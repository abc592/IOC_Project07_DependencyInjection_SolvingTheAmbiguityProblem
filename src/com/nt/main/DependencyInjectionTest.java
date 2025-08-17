package com.nt.main;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()(start)");
		//create IOC container
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
			
			WeekDayFinder finder = ctx.getBean("wx",WeekDayFinder.class);
			System.out.println("result::"+finder.showGreetMessage("Srikanth"));
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	

}
