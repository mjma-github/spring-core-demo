package com.mj.springdemo.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.mj.springdemo.javaconfig.coach.Coach;
import com.mj.springdemo.javaconfig.coach.SwimmingCoach;
import com.mj.springdemo.javaconfig.coach.SwimmingCoach2;
import com.mj.springdemo.javaconfig.fortuneservice.FortuneService;
import com.mj.springdemo.javaconfig.fortuneservice.SadFortuneService;

@Configuration
// @ComponentScan("com.mj.springdemo")
@PropertySources({ @PropertySource("sport.properties") })
public class SportsConfig2 {
	// bean for fortune service
	// note: method name will be used as bean id
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// bean for swim coach
	@Bean("buhain")
	public Coach swimCoach() {
		return new SwimmingCoach(sadFortuneService());
	}
	
	// bean for swim coach with autowired dependency
	@Bean("lozada")
	public Coach swimCoach2() {
		return new SwimmingCoach2("email1", "team1");
	}	
}
