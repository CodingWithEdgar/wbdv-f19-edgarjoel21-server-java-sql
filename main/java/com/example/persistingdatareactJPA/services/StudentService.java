package com.example.persistingdatareactJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistingdatareactJPA.models.Student;
import com.example.persistingdatareactJPA.repositories.StudentRepository;

@CrossOrigin(origins="*",allowCredentials="true",allowedHeaders="*")
@RestController
public class StudentService {

	  @Autowired
	  StudentRepository repository;
	  
	  @GetMapping("/api/students")
	  public List<Student> findAllStudents() {  
		  return (List<Student>)repository.findAll(); 
	  }
}
