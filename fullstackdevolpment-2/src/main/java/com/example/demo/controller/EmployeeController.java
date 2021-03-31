package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	@GetMapping("/home")
	public String home() {
		return "hello how are you and welcome to the world of java full stack";
	}
	
}
