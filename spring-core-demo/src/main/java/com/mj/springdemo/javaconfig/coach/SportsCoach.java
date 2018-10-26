package com.mj.springdemo.javaconfig.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

import com.mj.springdemo.javaconfig.fortuneservice.FortuneService;

public abstract class SportsCoach {

	FortuneService fortuneService;
	
	//field level injection from properties file
	@Value("${coach.email}")
	private String emailAddress;
	
	@Value("${coach.team}")
	private String team;
	
	public SportsCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}	

	public SportsCoach(String emailAddress, String team, FortuneService fortuneService) {
		super();
		this.emailAddress = emailAddress;
		this.team = team;
		this.fortuneService = fortuneService;
	}

	@PostConstruct
	private void initCoach() {
		System.out.println("SportsCoach.init()");
	}

	@PreDestroy
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
