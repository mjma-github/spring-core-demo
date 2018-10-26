package com.mj.springdemo.annotation.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mj.springdemo.annotation.fortuneservice.FortuneService;

@Component
public class SwimmingCoach extends SportsCoach implements Coach {

	// constructor injection
	public SwimmingCoach(@Value("${coach.email}") String emailAddress, @Value("${coach.team}") String team,
			@Autowired @Qualifier("randomFortuneService") FortuneService fortuneService) {
		super(emailAddress, team, fortuneService);
	}

	public String getDailyWorkout() {
		return "Do 10 laps of swimming";
	}
}
