package com.mj.springdemo.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.springdemo.xml.coach.BasketballCoach;

public class InjectionDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		Coach myCoach = context.getBean("myCoach", Coach.class);

		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getFortune());
		*/
		
		BasketballCoach myCoach = context.getBean("myCoach", BasketballCoach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getFortune());
		System.out.println(myCoach.getEmailAddress());
		System.out.println(myCoach.getTeam());
		
		context.close();
	}
}
