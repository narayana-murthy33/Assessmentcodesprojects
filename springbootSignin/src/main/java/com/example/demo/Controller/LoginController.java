package com.example.demo.Controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Login;
//import com.example.demo.Service.LoginService;

@RestController
public class LoginController {
	//@Autowired
	//LoginService loginService;
	
	@GetMapping("/hi")
	public Login get() {
		Login l=new Login();
		return l ;
	}

}
