package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/HelloWorld")
public String helloController() {
	return "Hello World";
	// TODO Auto-generated constructor stub
}
	
	@GetMapping(path="/HelloWorldBean")
	public HelloWorldBean helloControllerBean() {
		return new HelloWorldBean("Say Hellow Wordls");
		// TODO Auto-generated constructor stub
	}
}
