package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Employee;

@SpringBootApplication
public class FullstackapplicationApplication {

	public static void main(String[] args) {
		
		Employee e=new Employee();
	
		
		SpringApplication.run(FullstackapplicationApplication.class, args);
	}

}
