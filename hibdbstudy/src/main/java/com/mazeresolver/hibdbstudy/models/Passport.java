package com.mazeresolver.hibdbstudy.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Passport {
	
	@Id
	private String id;
	
	private String place;
	
	@OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
	@JsonBackReference
	private Student student;
	
	public Passport() {
		
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getId() {
		return id;
	}


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", place=" + place +"]";
	}
	
	
	
	
	

}
