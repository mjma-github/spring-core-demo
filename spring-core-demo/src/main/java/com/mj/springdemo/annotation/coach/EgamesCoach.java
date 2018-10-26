package com.mj.springdemo.annotation.coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EgamesCoach extends SportsCoach2 implements Coach {

	public EgamesCoach(@Value("${coach.email}") String emailAddress, @Value("${coach.team}") String team) {
		super(emailAddress, team);
	}

	public String getDailyWorkout() {
		return "play mobile legends";
	}
}
