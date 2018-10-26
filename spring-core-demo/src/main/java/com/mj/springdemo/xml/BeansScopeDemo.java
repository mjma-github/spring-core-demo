package com.mj.springdemo.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.springdemo.xml.coach.Coach;

public class BeansScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		
		//true if singleton, false if prototype
		System.out.println("coach1 == coach2 : " + (coach1 == coach2));
		
		/*
		 * in config:
		 *  if field is singleton & this class is singleton, resulting field is singleton
		 *  if field is singleton & this class is prototype, resulting field is singleton
		 *  if field is prototype & this class is singleton, resulting field is singleton
		 *  if field is prototype & this class is prototype, resulting field is prototype
		 *  
		 *  in short bean scope of class determines scope of bean field
		 */
		System.out.println("coach1.getFortuneService() == coach2.getFortuneService() : " + (coach1.getFortuneService() == coach2.getFortuneService()));
		context.close();
	}

}
