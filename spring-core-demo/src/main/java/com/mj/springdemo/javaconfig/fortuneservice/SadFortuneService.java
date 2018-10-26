package com.mj.springdemo.javaconfig.fortuneservice;

public class SadFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is a sad day!";
	}
}
