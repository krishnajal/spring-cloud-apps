package com.developer.kj.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.developer.kj.employeeservice.model.Employee;
import com.developer.kj.employeeservice.proxy.AddressServiceProxy;

@RestController
@RequestMapping("/employee-service")
public class EmployeeController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AddressServiceProxy addressServiceProxy;

	@GetMapping("/employee")
	public Employee getEmployee() {

		String hobby = restTemplate.getForObject("http://hobby-service/hobby-service/hobby", String.class);
		String address = addressServiceProxy.getAddress();

		return new Employee("John", "Doe", address, hobby);
	}

}
