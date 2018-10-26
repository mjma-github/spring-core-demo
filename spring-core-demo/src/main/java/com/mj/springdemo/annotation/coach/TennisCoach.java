package com.mj.springdemo.annotation.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.mj.springdemo.annotation.fortuneservice.FortuneService;

@Component("myCoach") // if using default bean id, if first 2 characters are in uppercase, resulting
						// default bean id case is same with class name, otherwise the first character
						// is in lower case
public class TennisCoach extends SportsCoach implements Coach {

	// constructor injection
	//note: in constructor, @autowired must be specified on the field, not the method/constructor
	public TennisCoach(@Value("${coach.email}") String emailAddress, @Value("${coach.team}") String team,
			@Autowired @Qualifier("randomFileFortuneService") FortuneService fortuneService) {
		super(emailAddress, team, fortuneService);
	}

	public String getDailyWorkout() {
		return "Practice backhand volleys for 30 mins.";
	}
}
