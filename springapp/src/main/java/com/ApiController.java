//package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2 {
@GetMapping("/welcome")
public String sak() {
	return "welcome";
}
}
