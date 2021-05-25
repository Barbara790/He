package com.helloworld2.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld2")
public class HelloWorld2 {
	
	@GetMapping
	public String helloWorld() {
		return "aprender String, avançar no Projeto Integrador, revisar JAVA";
	}

}
