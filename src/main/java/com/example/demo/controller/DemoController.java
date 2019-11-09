package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "/confclient" })
public class DemoController {
	@Value("${testvalue}")
	String remoteConfigValue;
	
	@GetMapping(value = "/")
	public ResponseEntity<String> printConf() {
		System.out.println("Test remove value :"+remoteConfigValue);
		return new ResponseEntity<String>("Remote Configuration retrieved :"+remoteConfigValue,HttpStatus.OK);
	}
}
