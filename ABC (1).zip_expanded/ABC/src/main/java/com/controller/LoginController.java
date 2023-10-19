package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	
//	@ResponseBody
	@RequestMapping("/hi")
	public String sayHi() {
		
		String response = "hello";
		
		
		
		return response;
	}
	
	@ResponseBody
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "Ha-Bolo";
	}

}
