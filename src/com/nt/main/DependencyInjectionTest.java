package com.nt.main;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()(start)");
		//create IOC container
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");){
			SeasonFinder finder = ctx.getBean("sf",SeasonFinder.class);
			String msg = finder.showSeasonName();
			System.out.println(msg);
			System.out.println("==========================");
			LocalDate date = ctx.getBean("ldate",LocalDate.class);
			System.out.println(date);
			System.out.println("==========================");
			System.out.println("Spring Beans count ::"+ctx.getBeanDefinitionCount());
			System.out.println("Spring Beans Defination names/ids ::"+Arrays.toString(ctx.getBeanDefinitionNames()));
			System.out.println("DependencyInjectionTest.main()(end)");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	

}
