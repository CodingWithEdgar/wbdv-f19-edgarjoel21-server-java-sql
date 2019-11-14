package com.example.persistingdatareactJPA.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity	
public class Faculty extends User {
	private String office;
	private Boolean tenure;
	@OneToMany(mappedBy="author")
	private List<Course> authoredCourses;

	public Faculty() {}

	public Faculty(int id, String username, String password, String firstName, String lastName, String office, Boolean tenure, List<Course> authoredCourses) {
		super(id, username, password, firstName, lastName);
		this.office = office;
		this.tenure = tenure;
		this.authoredCourses = authoredCourses;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Boolean getTenure() {
		return tenure;
	}

	public void setTenure(Boolean tenure) {
		this.tenure = tenure;
	}

	public List<Course> getAuthoredCourses() {
		return authoredCourses;
	}

	public void setAuthoredCourses(List<Course> authoredCourses) {
		this.authoredCourses = authoredCourses;
	}

	public void authoredCourse(Course course) {    
		this.authoredCourses.add(course);
		if(course.getAuthor() != this) {
			course.setAuthor(this);
			}
		}

}
