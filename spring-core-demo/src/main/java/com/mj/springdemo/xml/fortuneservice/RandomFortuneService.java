package com.mj.springdemo.xml.fortuneservice;

import java.util.Random;

import com.mj.springdemo.annotation.fortuneservice.FortuneService;

public class RandomFortuneService implements FortuneService {
	private static final String[] messages = { "You will win today", "You will lose today",
			"You are injure-prone today" };

	private static Random rand = new Random();

	public String getFortune() {
		return messages[rand.nextInt((3 - 1) + 1)];
	}

	// public static void main(String[] args) {
	// Scanner scanner = new Scanner(System.in);
	// String keypress = "";
	// while(!keypress.equalsIgnoreCase("q")) {
	// keypress = scanner.nextLine();
	// System.out.println(getFortune());
	// }
	// }
}
