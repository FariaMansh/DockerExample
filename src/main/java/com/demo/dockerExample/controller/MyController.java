package com.demo.dockerExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class MyController {
	
	@RequestMapping("/")
	public String getMessage() {
		return "Welcome to Docker";
	}

}
