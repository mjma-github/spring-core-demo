package com.mj.springdemo.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mj.springdemo.javaconfig.coach.Coach;
import com.mj.springdemo.javaconfig.coach.SportsCoach;
import com.mj.springdemo.javaconfig.config.SportsConfig2;
import com.mj.springdemo.util.RegisteredBeans;

public class JavaConfigManualDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig2.class);
		
		System.out.println("---Dependency is manually set in config---");
		//Coach swimCoach = context.getBean("swimCoach", Coach.class);
		Coach swimCoach = context.getBean("buhain", Coach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getFortune());
		
		if(swimCoach instanceof SportsCoach) {
			SportsCoach sportsCoach = (SportsCoach) swimCoach;
			System.out.println(sportsCoach.getEmailAddress());
			System.out.println(sportsCoach.getTeam());
		}
		
		System.out.println("---Dependency is autowired---");
		Coach swimCoach2 = context.getBean("lozada", Coach.class);
		System.out.println(swimCoach2.getDailyWorkout());
		System.out.println(swimCoach2.getFortune());		
		
		RegisteredBeans registeredBeans = new RegisteredBeans(context);
		System.out.println(registeredBeans);

		context.close();
	}

	/*
	 * Annotations tested:
	 * 
	 * @Configuration
	 * @Bean
	 * @PropertySource
	 */
}
