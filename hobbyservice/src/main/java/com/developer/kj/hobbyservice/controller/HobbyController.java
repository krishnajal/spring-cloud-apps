package com.developer.kj.hobbyservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hobby-service")
public class HobbyController {

	@Autowired
	private Environment env;
	
	@GetMapping("/hobby")
	public String getHobby() {
		return "PlayingCricket" + env.getProperty("server.port");
	}
}
