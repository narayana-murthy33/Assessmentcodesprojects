package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.CourseRepository;
import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.Studentservice;

@SpringBootApplication
public class Springjpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Springjpa2Application.class, args);
		CourseRepository courseRepository=context.getBean("courseRepository",CourseRepository.class);
		StudentRepository StudentRepository=context.getBean("studentRepository",StudentRepository.class);
		Studentservice service=context.getBean("studentservice",Studentservice.class);
		Student student=service.getStudent(1);
		List<Course> course=student.getCourses();
		for(Course cour:course) {
			System.out.println(cour.getName());
		}
		
		
		
	}

}
