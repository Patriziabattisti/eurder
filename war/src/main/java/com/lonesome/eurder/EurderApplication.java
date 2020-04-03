package com.lonesome.eurder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.lonesome.eurder"},exclude = {SecurityAutoConfiguration.class})
public class EurderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurderApplication.class, args);
	}

}
