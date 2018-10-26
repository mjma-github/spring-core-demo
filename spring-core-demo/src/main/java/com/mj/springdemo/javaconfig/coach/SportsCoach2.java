package com.mj.springdemo.javaconfig.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.mj.springdemo.javaconfig.fortuneservice.FortuneService;

public abstract class SportsCoach2 {

	@Autowired
	@Qualifier("sadFortuneService")
	FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public SportsCoach2(String emailAddress, String team) {
		super();
		this.emailAddress = emailAddress;
		this.team = team;
	}

	public SportsCoach2(String emailAddress, String team, FortuneService fortuneService) {
		super();
		this.emailAddress = emailAddress;
		this.team = team;
		this.fortuneService = fortuneService;
	}

	@PostConstruct
	private void initCoach() {
		System.out.println("SportsCoach2.init()");
	}

	@PreDestroy
	private void destroyCoach() {
		System.out.println("SportsCoach2.destroy()");
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
