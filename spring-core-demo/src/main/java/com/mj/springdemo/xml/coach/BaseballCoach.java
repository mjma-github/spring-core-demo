package com.mj.springdemo.xml.coach;

public class BaseballCoach extends SportsCoach implements Coach {

	public BaseballCoach(String emailAddress, String team) {
		super(emailAddress, team);
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
}
