package com.mj.springdemo.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mj.springdemo.javaconfig.coach.Coach;
import com.mj.springdemo.javaconfig.coach.SportsCoach;
import com.mj.springdemo.javaconfig.config.SportsConfig3;
import com.mj.springdemo.util.RegisteredBeans;

public class JavaConfigManualDemo2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig3.class);
		
		System.out.println("---Dependency is manually set in config---");
		Coach coach = context.getBean("hopscotchCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		if(coach instanceof SportsCoach) {
			SportsCoach sportsCoach = (SportsCoach) coach;
			System.out.println(sportsCoach.getEmailAddress());
			System.out.println(sportsCoach.getTeam());
		}
		
		RegisteredBeans registeredBeans = new RegisteredBeans(context);
		System.out.println(registeredBeans);

		context.close();
	}
}
