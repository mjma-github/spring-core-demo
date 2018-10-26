package com.mj.springdemo.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.mj.springdemo.javaconfig.coach.Coach;
import com.mj.springdemo.javaconfig.coach.HopscotchCoach;
import com.mj.springdemo.javaconfig.fortuneservice.FortuneService;
import com.mj.springdemo.javaconfig.fortuneservice.NeutralFortuneService;

@Configuration
@PropertySources({ @PropertySource("sport.properties") })
public class SportsConfig3 {
	
	@Bean("neutralFortune")
	public FortuneService neutralFortuneService() {
		return new NeutralFortuneService();
	}

	@Bean
	public Coach hopscotchCoach() {
		return new HopscotchCoach(neutralFortuneService());
	}
}
