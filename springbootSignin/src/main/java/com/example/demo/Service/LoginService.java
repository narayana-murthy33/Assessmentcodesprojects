package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.LoginRepo.LoginRepo;

@Service
public class LoginService {
	@Autowired
	LoginRepo loginRepo;

}
