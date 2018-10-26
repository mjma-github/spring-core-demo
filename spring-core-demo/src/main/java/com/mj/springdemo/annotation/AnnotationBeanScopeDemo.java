package com.mj.springdemo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.springdemo.annotation.coach.Coach;
import com.mj.springdemo.util.RegisteredBeans;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		Coach tennisCoach1 = context.getBean("tennisCoachSingleton", Coach.class);
		Coach tennisCoach2 = context.getBean("tennisCoachSingleton", Coach.class);
		
		//same object
		System.out.println("tennisCoach1 == tennisCoach2 ? : " + (tennisCoach1 == tennisCoach2));
		
		//different objects
		Coach tennisCoach3 = context.getBean("tennisCoachPrototype", Coach.class);
		System.out.println("tennisCoach2 == tennisCoach3 ? : " + (tennisCoach2 == tennisCoach3));
		
		System.out.println("\n***Registered Beans***");
		RegisteredBeans registeredBeans = new RegisteredBeans(context);
		System.out.println(registeredBeans);			
		
		context.close();
	}
	
	/* Annotations tested:
	 * @Scope
	 */
}
