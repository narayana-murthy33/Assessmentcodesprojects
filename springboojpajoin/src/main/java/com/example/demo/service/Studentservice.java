package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

@Service
public class Studentservice {
	@Autowired
	private StudentRepository studentRepository;
	@Transactional
	public Student getStudent(int id) {
		Student student=studentRepository.findById(null).orElse(null);
		List<Course> course=student.getCourses();
		for(Course cour:course) {
			System.out.println(cour.getName());
		}
		return student;
		
	}
	

}
