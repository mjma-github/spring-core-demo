package com.mj.springdemo.xml.coach;

import com.mj.springdemo.xml.fortuneservice.FortuneService;

public interface Coach {

	String getDailyWorkout();
	
	String getFortune();
	
	FortuneService getFortuneService();

}