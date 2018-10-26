package com.mj.springdemo.xml.coach;

public class BasketballCoach extends SportsCoach implements Coach {
	

	public BasketballCoach(String emailAddress, String team) {
		super(emailAddress, team);
		System.out.println("BasketballCoach(emailAddress, team)");
	}
	
	public String getDailyWorkout() {
		return "Do some freethrows";
	}
}
