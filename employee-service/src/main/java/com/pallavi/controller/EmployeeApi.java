package com.pallavi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {

	@GetMapping("/message")
	public String test() {
		return "Hello all! Called in employee Service";
	}
}
