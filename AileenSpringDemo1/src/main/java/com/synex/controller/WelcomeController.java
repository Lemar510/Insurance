package com.synex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to a spring boot";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello there";
	}
	
	@GetMapping("/home")
	public String home() {
		return "Hello home";
	}
}

//This is a RestController API (dynamic), giving a textual response. 

/*
 * - html is static whereas jsp cant be accessed directly and we dont put jsp inside static folder. 
 * - JSP executes and generates static response...jsp is compiled and converted.
 * - Also, anything that we want anyone to see, we put inside the static folder
 * - 
 * */
