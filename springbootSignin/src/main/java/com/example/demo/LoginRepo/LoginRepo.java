package com.example.demo.LoginRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Login;
@Repository
public interface LoginRepo extends JpaRepository<Login,Integer>{

}
