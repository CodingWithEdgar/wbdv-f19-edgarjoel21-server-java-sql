package com.example.persistingdatareactJPA.models;

import javax.persistence.Entity;

@Entity
public class Student extends User {
	private float gpa;
	private int graduationYear;


	public Student() {super();}
	public Student(int id, String username, String password, String firstName, String lastName, float gpa, int graduationYear) {
		super(id, username, password, firstName, lastName);
		this.gpa = gpa;
		this.graduationYear = graduationYear;
	}
	
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public int getGraduationYear() {
		return graduationYear;
	}
	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}
	
	

}
