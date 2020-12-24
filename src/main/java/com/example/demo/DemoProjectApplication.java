package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//SpringBootApplication annotation is used to make a configuration class that declares one or more
//@Bean methods and also triggers auto-configuration and component scanning.
//Its same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations
//This is the main class class from where the spring boot project triggers and start the configuration

public class DemoProjectApplication {

	public static final Logger log = LoggerFactory.getLogger(DemoProjectApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoProjectApplication.class, args);
		
		log.info("Welcome to boot...");

		Alien a = context.getBean(Alien.class);
//		a = context.getBean(Alien.class);
		a.show();
	}

}
