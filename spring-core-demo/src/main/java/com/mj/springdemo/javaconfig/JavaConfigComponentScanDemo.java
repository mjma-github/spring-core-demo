package com.mj.springdemo.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mj.springdemo.javaconfig.config.SportsConfig;
import com.mj.springdemo.util.RegisteredBeans;

public class JavaConfigComponentScanDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		RegisteredBeans registeredBeans = new RegisteredBeans(context);
		System.out.println(registeredBeans);

		context.close();
	}

	/*
	 * Annotations tested:
	 * 
	 * @Configuration
	 * @ComponentScan
	 * @PropertySource
	 * @PropertySources
	 */
}
