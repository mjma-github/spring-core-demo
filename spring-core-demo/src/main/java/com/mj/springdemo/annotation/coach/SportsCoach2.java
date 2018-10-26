package com.mj.springdemo.annotation.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.mj.springdemo.annotation.fortuneservice.FortuneService;

public abstract class SportsCoach2 {

	FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public SportsCoach2(String emailAddress, String team) {
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

	//setter injection
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("SportsCoach2.setFortuneService()");
		this.fortuneService = fortuneService;
	}
	
	//method injection
	@Autowired
	@Qualifier("randomFortuneService")
	public void anotherSetFortuneService(FortuneService fortuneService) {
		System.out.println("SportsCoach2.anotherSetFortuneService()");
		this.fortuneService = fortuneService;
	}
}
