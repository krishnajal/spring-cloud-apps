package com.developer.kj.hobbyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HobbyserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HobbyserviceApplication.class, args);
	}

}
