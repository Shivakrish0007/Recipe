package com.recipe.controller;

import com.recipe.model.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/health")
	public Greeting index() {
		return new Greeting("Hello world!");
	}

}
