package com.testjava.BelajarSpringJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BelajarSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaApplication.class, args);
	}

}
