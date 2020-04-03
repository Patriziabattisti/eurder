package com.lonesome.eurder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class EurderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurderApplication.class, args);
	}

}
