package com.mj.springdemo.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.support.AbstractApplicationContext;

public class RegisteredBeans {
	private Map<String, String> beansMap = new HashMap<>();

	public RegisteredBeans(AbstractApplicationContext context) {
		if (context == null) {
			return;
		}

		for (String beanName : context.getBeanDefinitionNames()) {
			beansMap.put(beanName, context.getBean(beanName).getClass().toString());
		}
	}

	public Map<String, String> getBeansMap() {
		return Collections.unmodifiableMap(beansMap);
	}

	@Override
	public String toString() {
		StringBuffer message = new StringBuffer("\n*** Registered Beans***\n");
		for (Entry<String, String> entryMap : beansMap.entrySet()) {
			message.append(rightPad(entryMap.getKey(), ' ', 100) + " : " + entryMap.getValue() + "\r\n");
		}

		return message.toString();
	}
	
	private String rightPad(String stringToPad, char pad, int length) {
		
		if(stringToPad.length() > length) {
			return stringToPad.substring(0, length);
		}
		
		while(stringToPad.length() <= length) {
			stringToPad += pad;
		}
		
		return stringToPad;
	}
}
