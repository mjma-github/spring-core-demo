package com.mj.springdemo.annotation.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mj.springdemo.annotation.fortuneservice.FortuneService;

@Component
@Scope("prototype")
public class TennisCoachPrototype extends SportsCoach implements Coach {
	
	//constructor injection
	public TennisCoachPrototype(@Value("${coach.email}") String emailAddress, @Value("${coach.team}") String team,
			@Autowired @Qualifier("randomFileFortuneService") FortuneService fortuneService) {
		super(emailAddress, team, fortuneService);
	}

	public String getDailyWorkout() {
		return "Practice backhand volleys for 30 mins.";
	}
	
	@PostConstruct
	private void init() {
		System.out.println("TennisCoachPrototype.init(): inside method annotated with @PostConstruct");
	}
	
	//Note: For prototype scoped beans, @PreDestroy methods are not called after context.close()
	@PreDestroy
	private void cleanup() {
		System.out.println("TennisCoachPrototype.cleanup(): inside method annotated with @PreDestroy");
	}
}
