package com.spring.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EmidsDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmidsDataApplication.class, args);
	}

}
