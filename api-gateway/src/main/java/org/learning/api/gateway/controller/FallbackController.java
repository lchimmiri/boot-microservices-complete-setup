package org.learning.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/userServiceFallback")
	public String userServiceFallbackMethod() {
		return "User service is taking longer than Expected. Please try again";
	}
	
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallbackMethod() {
		return "Department service is taking longer than Expected. Please try again";
	}
}
