package com.mj.springdemo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.springdemo.annotation.coach.Coach;
import com.mj.springdemo.util.RegisteredBeans;

public class AnnotationBeanLifecycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"annotation-applicationContext.xml");
		Coach tennisCoach1 = context.getBean("tennisCoachSingleton", Coach.class);
		Coach tennisCoach2 = context.getBean("tennisCoachSingleton", Coach.class);
		Coach tennisCoach3 = context.getBean("tennisCoachPrototype", Coach.class);
		Coach tennisCoach4 = context.getBean("tennisCoachPrototype", Coach.class);

		System.out.println("\n***Registered Beans***");
		RegisteredBeans registeredBeans = new RegisteredBeans(context);
		System.out.println(registeredBeans);

		context.close();
	}

	/*
	 * Annotations tested:
	 * 
	 * @PostConstruct - runs after constructor and injection of dependecies
	 * 
	 * @PreDestroy - before bean is destroyed
	 * 
	 * Note: annotated methods can have any access modifier, void return type, any
	 * name, & no args
	 * 
	 * Note: for Java 9, libraries must be imported containing the 2 annotations
	 * 
	 * Note: For prototype scoped beans, @PreDestroy methods are not called after
	 * context.close(), since prototype lifecycle is not managed by spring container
	 * 
	 * Note: on scopes
	 * 	if field is singleton & this class is singleton, resulting field is singleton
	 *  if field is singleton & this class is prototype, resulting field is singleton
	 *  if field is prototype & this class is singleton, resulting field is singleton, workaround: https://www.youtube.com/watch?v=_jLLcPlWhVU
	 *  if field is prototype & this class is prototype, resulting field is prototype
	 *  
	 *  in short bean scope of class determines scope of bean field
	 *  
	 *  Note: When the scope is Prototype, the bean is not instantiated on application startup and is done only when the main program calls to initialize it, 
	 *  whereas in singleton bean is instantiated and initialized on startup.
	 */
}
