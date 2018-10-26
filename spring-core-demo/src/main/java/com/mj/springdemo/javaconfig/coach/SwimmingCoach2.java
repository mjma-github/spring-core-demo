package com.mj.springdemo.javaconfig.coach;

import org.springframework.beans.factory.annotation.Value;

public class SwimmingCoach2 extends SportsCoach2 implements Coach {

	// constructor injection
	public SwimmingCoach2(@Value("${coach.email}") String emailAddress, @Value("${coach.team}") String team) {
		super(emailAddress, team);
	}

	public String getDailyWorkout() {
		return "Do 10 laps of swimming";
	}
}
