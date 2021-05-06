package com.Archana.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
//	@RequestMapping("/")
//	public String Hello()
//	{
//		return "hello world Archana ";
//	}
	
	@GetMapping("/hello")
	public String Hello()
	{
		return "hello world Archana ";
	}

}
