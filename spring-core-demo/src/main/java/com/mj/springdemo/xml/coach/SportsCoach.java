package com.mj.springdemo.xml.coach;

import com.mj.springdemo.xml.fortuneservice.FortuneService;

public abstract class SportsCoach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public SportsCoach(String emailAddress, String team) {
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

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setFortuneService(fortuneService)");
		this.fortuneService = fortuneService;
	}

	public String getFortune() {
		return this.fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}	
}
