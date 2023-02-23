package com.welcome.program.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
  String name = "Bolt";
  @GetMapping("/2")
	public String getName() {
			return "welcome "+name+" !";
	}
}




