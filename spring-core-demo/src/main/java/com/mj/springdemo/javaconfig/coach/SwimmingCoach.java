package com.mj.springdemo.javaconfig.coach;

import com.mj.springdemo.javaconfig.fortuneservice.FortuneService;

public class SwimmingCoach extends SportsCoach implements Coach {

	// constructor injection
	public SwimmingCoach(FortuneService fortuneService) {
		super(fortuneService);
	}

	public String getDailyWorkout() {
		return "Do 10 laps of swimming";
	}
}
