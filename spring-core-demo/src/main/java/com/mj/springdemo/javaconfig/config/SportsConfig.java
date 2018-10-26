package com.mj.springdemo.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.mj.springdemo")
@PropertySources({ @PropertySource("application.properties"), @PropertySource("sport.properties")})
public class SportsConfig {

}
