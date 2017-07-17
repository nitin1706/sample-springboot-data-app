package org.nitin1706.practice.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/helloworld")
	public String sayHelloWorld() {
		return "Hello World...!!! \nThis is a simple SpringBoot Application";
	}

}
