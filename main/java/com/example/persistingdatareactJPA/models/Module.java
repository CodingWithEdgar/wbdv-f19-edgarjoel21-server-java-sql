package com.example.persistingdatareactJPA.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="modules")
public class Module {
	@Id
	int id;
	String title;
	@ManyToOne
    @JsonIgnore
    private Course course;

	public Module() {
		// TODO Auto-generated constructor stub
	}

	public Module(int id, String title, Course course) {
		super();
		this.id = id;
		this.title = title;
		this.course = course;
	}
	
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void set(Module module) {
		if (module.getTitle() != null) {
			this.setTitle(module.getTitle());
		}
	}
	

}
