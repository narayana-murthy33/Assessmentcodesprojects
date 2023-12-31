package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Nani;

@Repository
public interface Userrepository extends JpaRepository<Nani,String> {
	 List<Nani> findByEmailAndPassword(String email,String password);

}
