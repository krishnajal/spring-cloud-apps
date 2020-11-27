package com.developer.kj.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address-service")
public class AddressController {

	@Autowired
	private Environment env;
	
	@Value("${config.default.message}")
	private String message;

	@GetMapping("/address")
	public String getAddress() {
		return "Governor hills drive, Cincinnati" + env.getProperty("server.port")
				+ env.getProperty("config.default.message")+" - " + message;
	}
}
