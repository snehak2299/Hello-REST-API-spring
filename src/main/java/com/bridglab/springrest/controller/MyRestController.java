package com.bridglab.springrest.controller;


import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bridglab.springrest.beans.*;

@RestController

public class MyRestController {
	Message msg;
	@RequestMapping("/")
	public String Welcome() {
		return "Welcome to REST Page";
	}


	@RequestMapping(value= {"/query"},method=RequestMethod.GET)  // UC2 send name as query parameter
	public String sayHello(@RequestParam(value="name")String name) {
		return "Hello " +name+ " from bridglab";
	}
	
	@RequestMapping("/hello/{name}")    // UC3 send name as path variable
	public Message message(@PathVariable String name) {
		msg = new com.bridglab.springrest.beans.Message(name, "Hello " + name + " !");
		return msg;
	}
	@PostMapping("/post")
	public String sayHello(@RequestBody Message name) {
		return "Hello " + name.getName() + "" + name.getlast() +"!";
	}
	
}

