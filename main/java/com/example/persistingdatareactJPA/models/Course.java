package com.example.persistingdatareactJPA.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="courses")
public class Course {
  @Id 
  private int id;
  private String name;
  @ManyToOne() 
  @JsonIgnore
  private Faculty author;
  
public Course() {}
public Course(int id, String name, Faculty author) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Faculty getAuthor() {
	return author;
}

public void setAuthor(Faculty faculty) {
	  this.author = faculty;
	  if(!faculty.getAuthoredCourses().contains(this)) {
	     faculty.getAuthoredCourses().add(this);
	     }
	  }
}

