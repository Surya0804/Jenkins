package com.example.jenkinsProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication implements CommandLineRunner {
	private static final Logger logger=LoggerFactory.getLogger(JenkinsProjectApplication.class);

	public static void main(String[] args) {
		logger.info("Build started surya");
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Build ended surya");

	}

}
