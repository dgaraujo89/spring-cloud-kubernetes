package com.github.diegogomesaraujo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringInternalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInternalServiceApplication.class, args);
	}

}
