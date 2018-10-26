package com.mj.springdemo.xml.fortuneservice;

import com.mj.springdemo.annotation.fortuneservice.FortuneService;

public class HappyFortuneService implements FortuneService {
	/* (non-Javadoc)
	 * @see com.mj.springdemo.FortuneService#getFortune()
	 */
	public String getFortune() {
		return "Today is your lucky day!";
	}
}
