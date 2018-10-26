package com.mj.springdemo.annotation.fortuneservice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
public class RandomFileFortuneService implements FortuneService {
	private static final int STARTING_INDEX = 0;
	private static Random rand = new Random();
	private static List<String> messages = new ArrayList<>();
	
	@Value("${randomfortune.filename}")
	private String filename;

//	static {
//		setMessagesFromFile();
//	}
//	
//	private static void setMessagesFromFile() {
//		try {
//			@SuppressWarnings("deprecation")
//			String str = IOUtils.toString(ResourceUtils.getURL("./src/main/resources/fortunes.txt"));
//			messages = Arrays.asList(str.split("\r\n"));
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	@PostConstruct
	private void setMessagesFromFile() {
		System.out.println("RandomFileFortuneService.setMessagesFromFile(): inside @PostConstruct method");
		
		try {
			@SuppressWarnings("deprecation")
			String str = IOUtils.toString(ResourceUtils.getURL(this.filename));
			messages = Arrays.asList(str.split("\r\n"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		return messages.get(rand.nextInt((messages.size() - 1) + STARTING_INDEX));
	}

//Note: solution from other students
//	@PostConstruct
//	 public String readFileSystem() {
//	 String ret="";
//	 try {
//	 Charset charset = Charset.forName("ISO-8859-1");
//	 fortune = Files.readAllLines(Paths.get("C:\\Practice\\testings\\myfile.txt"),charset).toArray();
//	 
//	 } catch (IOException e) {
//	 e.printStackTrace();
//	 } 
//	 return ret; 
//	 }	
}
