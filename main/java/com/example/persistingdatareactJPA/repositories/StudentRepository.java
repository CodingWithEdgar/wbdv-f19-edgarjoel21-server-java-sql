package com.example.persistingdatareactJPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.persistingdatareactJPA.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> { 
	
}
