package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.Configuration;
import com.example.demo.dto.Credentials;

@RestController
public class ConfigController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/config")
	public Credentials getConfig() {
		
		String userName = configuration.getUserName();
		String password = configuration.getPassword();
		return new Credentials(userName,password);
	}

}
