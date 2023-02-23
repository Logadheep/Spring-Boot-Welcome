package com.welcome.program.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller3 {
	String color = "blue";
	@GetMapping("/3")
	public String getColor() {
			return "welcome "+color+" !";
	}
}




