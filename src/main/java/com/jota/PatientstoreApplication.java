package com.jota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
//@EnableMongoAuditing
public class PatientstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientstoreApplication.class, args);
	}

}
