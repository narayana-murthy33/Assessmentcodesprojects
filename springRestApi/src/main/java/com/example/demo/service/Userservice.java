package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Nani;

public interface Userservice {
	public UserDTO getUser() ;

	public UserDTO getUser(String id);

	public void save(UserDTO userdto);

	public void deleteuser();
		
	

}
