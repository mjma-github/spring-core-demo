package com.mj.springdemo.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.springdemo.xml.coach.Coach;

public class BeansLifecycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
		Coach coach1 = context.getBean("myCoach", Coach.class);
		context.close();
	}

}
