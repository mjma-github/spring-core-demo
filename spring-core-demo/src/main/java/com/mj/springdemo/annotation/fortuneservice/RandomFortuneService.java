package com.mj.springdemo.annotation.fortuneservice;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private static final String[] messages = { "You will win today", "You will lose today",
			"You are injure-prone today" };
	private static final int STARTING_INDEX = 1;
	private static Random rand = new Random();

	public final String getFortune() {
		return messages[rand.nextInt((messages.length - 1) + STARTING_INDEX)];
	}
}
