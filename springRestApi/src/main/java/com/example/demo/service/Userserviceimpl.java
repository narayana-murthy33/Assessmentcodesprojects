package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Userrepository;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Nani;
@Service
public class Userserviceimpl implements Userservice{
	@Autowired
	Userrepository userrepository;

	@Override
	public UserDTO getUser() {
		// TODO Auto-generated method stub
		String userid="nan";
		Nani n=userrepository.findById(userid).get();
		UserDTO u=new UserDTO();
		BeanUtils.copyProperties(n, u);
		return u;
	}

	@Override
	public UserDTO getUser(String id) {
		
		Nani n=userrepository.findById(id).get();
		UserDTO u=new UserDTO();
		BeanUtils.copyProperties(n, u);
		return u;
	}

	@Override
	public void save(UserDTO userdto) {
		// TODO Auto-generated method stub
		Nani n= new Nani();
		BeanUtils.copyProperties(userdto, n);
		
	userrepository.save(n);
		
	}

	@Override
	public void deleteuser() {
		// TODO Auto-generated method stub
		String id="love";
		userrepository.deleteById(id);
		
	}

}
