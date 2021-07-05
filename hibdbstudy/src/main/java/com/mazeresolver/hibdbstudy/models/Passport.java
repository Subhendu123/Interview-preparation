package com.mazeresolver.hibdbstudy.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	private String id;
	
	@Column( name = "s_id")
	private int studentId;
	
	private String place;
	
	@OneToOne
	@JoinColumn(name = "s_id",insertable = false,updatable = false)
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

	public int getStudentId() {
		return studentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", studentId=" + studentId + ", place=" + place + ", student=" + student + "]";
	}
	
	
	
	
	

}
