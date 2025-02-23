package com.example.springoauth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public ResponseEntity<?> home()
	{
		return new ResponseEntity<>("Welcome to becoder",HttpStatus.OK);
	}
}
