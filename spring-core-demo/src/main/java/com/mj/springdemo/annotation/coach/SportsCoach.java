package com.mj.springdemo.annotation.coach;

import com.mj.springdemo.annotation.fortuneservice.FortuneService;

public abstract class SportsCoach {

	FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public SportsCoach(String emailAddress, String team, FortuneService fortuneService) {
		super();
		this.emailAddress = emailAddress;
		this.team = team;
		this.fortuneService = fortuneService;
	}

	private void initCoach() {
		System.out.println("SportsCoach.init()");
	}

	private void destroyCoach() {
		System.out.println("SportsCoach.destroy()");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public String getFortune() {
		return this.fortuneService.getFortune();
	}
}
