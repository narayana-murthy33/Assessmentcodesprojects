package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.entity.Adress;
import com.entity.User;
import com.flm.repository.LoginServiceRepository;
import com.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginServiceRepository loginServiceRepository;

	@Override
	public void signUpUser(User user) {
		loginServiceRepository.singUpUser(user);
		System.out.println("Service Invoked !!");

	}

	@Override
	public void bookuser(Adress adress) {
		// TODO Auto-generated method stub
		loginServiceRepository.bookuser(adress);
		
	}

}
