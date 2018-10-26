package com.mj.springdemo.annotation.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.mj.springdemo.annotation.fortuneservice.FortuneService;

public abstract class SportsCoach3 {

	//Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	public SportsCoach3(String emailAddress, String team) {
		super();
		this.emailAddress = emailAddress;
		this.team = team;
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
