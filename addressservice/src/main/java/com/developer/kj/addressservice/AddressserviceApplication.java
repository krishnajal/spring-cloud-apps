package com.developer.kj.addressservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddressserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressserviceApplication.class, args);
	}

}
