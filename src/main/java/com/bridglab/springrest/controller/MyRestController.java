package com.bridglab.springrest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@RequestMapping("/")
	public String Welcome() {
		return "Welcome to REST Page";
	}

}

