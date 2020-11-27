package com.developer.kj.employeeservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_EMPTY)
public class Employee {
	
	@JsonProperty
	private String firstName;
	
	@JsonProperty
	private String lastName;
	
	@JsonProperty
	private String address;
	
	@JsonProperty
	private String hobby;

	public Employee(String firstName, String lastName, String address, String hobby) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.hobby = hobby;
	}
}
