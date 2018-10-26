package com.mj.springdemo.javaconfig.fortuneservice;

public class NeutralFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Nothing will happen";
	}

}
