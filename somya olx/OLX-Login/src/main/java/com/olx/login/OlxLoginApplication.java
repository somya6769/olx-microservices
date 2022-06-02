package com.olx.login;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class OlxLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxLoginApplication.class, args);
	}
	@Bean
	ModelMapper getMapper() {
		return new ModelMapper();

	}
}
