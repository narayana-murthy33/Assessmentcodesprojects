package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class LoginController {
	@ResponseBody
	@RequestMapping("/hi")
	public String sayhi() {
		return "Hello Nani Garu";
	}
public LoginController() {
	System.out.println("Hii Nani");
}
}