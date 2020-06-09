package com.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@Component
@RequestMapping("/process")
public class ProcessController {
	
	@RequestMapping("/add")
	public String getDetails() {
		return "HI All welcome to DevOps Practice";
	}

}
