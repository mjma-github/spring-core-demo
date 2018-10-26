package com.mj.springdemo.annotation.coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChessCoach extends SportsCoach3 implements Coach {

	public ChessCoach(@Value("${coach.email}") String emailAddress, @Value("${coach.team}") String team) {
		super(emailAddress, team);
	}

	public String getDailyWorkout() {
		return "Duel with big blue";
	}

}
