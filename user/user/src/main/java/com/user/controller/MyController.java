package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "user")
public class MyController {
	@GetMapping(path = "/test")
	public String test() {
		return "I am User";
	}
}
