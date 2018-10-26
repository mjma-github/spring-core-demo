package com.mj.springdemo.javaconfig.coach;

import com.mj.springdemo.javaconfig.fortuneservice.FortuneService;

public class HopscotchCoach extends SportsCoach implements Coach {

	// constructor injection
	public HopscotchCoach(FortuneService fortuneService) {
		super(fortuneService);
	}

	public String getDailyWorkout() {
		return "Jump around! Jump up and down!!";
	}
}
