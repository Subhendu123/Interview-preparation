package com.mazeresolver.hibdbstudy.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Student {

	@Id
	private int id;
	
	private String name;
	
	private String passportId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passportId", insertable = false, updatable = false)
	@JsonManagedReference
	private Passport passport;
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
	
	
}
