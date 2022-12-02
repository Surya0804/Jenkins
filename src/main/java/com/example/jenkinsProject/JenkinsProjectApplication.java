package com.example.jenkinsProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {
	private static final Logger logger=LoggerFactory.getLogger(JenkinsProjectApplication.class);

	public static void main(String[] args) {
		logger.info("Built Successfully Team Surya");
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}
