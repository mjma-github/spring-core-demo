package com.mj.springdemo.xml.coach;

public class TrackCoach extends SportsCoach implements Coach {

	public TrackCoach(String emailAddress, String team) {
		super(emailAddress, team);
	}

	public String getDailyWorkout() {
		return "Run hard for 5k daily";
	}
}
