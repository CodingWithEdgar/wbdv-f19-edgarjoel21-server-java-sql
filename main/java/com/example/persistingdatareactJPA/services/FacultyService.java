package com.example.persistingdatareactJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistingdatareactJPA.models.Course;
import com.example.persistingdatareactJPA.models.Faculty;
import com.example.persistingdatareactJPA.repositories.CourseRepository;
import com.example.persistingdatareactJPA.repositories.FacultyRepository;

@RestController
public class FacultyService {
	@Autowired
	FacultyRepository repository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/api/faculty")
	public List<Faculty> findAllFaculty() {
	   return (List<Faculty>)repository.findAll();
	}

	@PutMapping("/api/faculty/{fId}/authored/{cId}")
	public void authoredCourse(@PathVariable("fId") int fId, @PathVariable("cId") int cId) {
		Faculty faculty = repository.findById(fId).get();
		Course course   = courseRepository.findById(cId).get();
		course.setAuthor(faculty);
		courseRepository.save(course);
	}
}