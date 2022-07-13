package com.example.booting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class bootingcontroller {
	@GetMapping("/save")
	public String boot() {
		return "Welcome to world";
	}
	

}
