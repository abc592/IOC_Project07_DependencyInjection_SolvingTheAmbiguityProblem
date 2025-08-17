package com.nt.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig::0-Param");
	}
	
	@Bean(name="ldate")
	public LocalDate createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
		
	}
	@Bean(name="ldate1")
	@Primary
	public LocalDate createDate1() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.of(2020,12,31);
	}
		
	@Bean(name="ldate2")
	public LocalDate createDate2() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.of(2025,12,31);
		
	}
	@Bean(name="ldate3")
	public LocalDate createDate3() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.of(2024,12,31);
		
	}

}
