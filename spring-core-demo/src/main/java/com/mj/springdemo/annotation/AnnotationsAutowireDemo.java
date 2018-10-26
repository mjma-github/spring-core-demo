package com.mj.springdemo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.springdemo.annotation.coach.Coach;
import com.mj.springdemo.util.RegisteredBeans;

public class AnnotationsAutowireDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"annotation-applicationContext.xml");
		
		////// Constructor injection //////
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println("coach daily workout: " + coach.getDailyWorkout());
		System.out.println("coach fortune: " + coach.getFortune());

		// Using default bean id
		Coach coach2 = context.getBean("swimmingCoach", Coach.class);
		System.out.println("coach2 daily workout: " + coach2.getDailyWorkout());
		System.out.println("coach2 fortune: " + coach2.getFortune());

		////// Setter injection //////
		////// Method injection - any method name //////
		Coach coach3 = context.getBean("egamesCoach", Coach.class);
		System.out.println("coach3 daily workout: " + coach3.getDailyWorkout());
		System.out.println("coach3 fortune: " + coach3.getFortune());
		
		////// Field injection //////
		Coach coach4 = context.getBean("chessCoach", Coach.class);
		System.out.println("coach4 daily workout: " + coach4.getDailyWorkout());
		System.out.println("coach4 fortune: " + coach4.getFortune());
		
		System.out.println("\n***Registered Beans***");
		RegisteredBeans registeredBeans = new RegisteredBeans(context);
		System.out.println(registeredBeans);		

		context.close();
	}

	/* Annotations tested:
	 * @Component
	 * @Value
	 * @Autowired
	 * @Qualifier
	 */
	
}
