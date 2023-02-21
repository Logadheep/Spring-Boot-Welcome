package com.welcome.program.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
	@GetMapping("/welcome")
	public static String welcome() {
		return "Welcome";
	}
}
