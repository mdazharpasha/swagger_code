package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
@GetMapping(value = "/user/{userId}")
	public String getName(@PathVariable Integer userId) {
		if(userId==100) {
			return "Yes";
		}
		else if(userId ==200) {
			return "No";
		}
		else{
			return "User not found";
		}
	}
}
