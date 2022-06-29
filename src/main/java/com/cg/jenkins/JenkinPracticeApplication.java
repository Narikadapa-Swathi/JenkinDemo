package com.cg.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class JenkinPracticeApplication {

public static Logger logger=(Logger) LoggerFactory.getLogger(JenkinPracticeApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started....");
	}
	public static void main(String[] args) {
		
		logger.info("Jenkin Application has been excuted....");
		SpringApplication.run(JenkinPracticeApplication.class, args);
	}

}
