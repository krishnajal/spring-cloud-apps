package com.developer.kj.employeeservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("address-service")
public interface AddressServiceProxy {

	@GetMapping("/address-service/address")
	public String getAddress();
}
