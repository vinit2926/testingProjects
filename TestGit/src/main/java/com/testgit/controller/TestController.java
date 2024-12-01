package com.testgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public String test() {
		return "This is message from spring boot application";
	}
	
	@GetMapping
	public String testin1() {
		return "Another message";
	}
	
	@GetMapping
	public String testin2() {
		return "One more time";
	}
}
