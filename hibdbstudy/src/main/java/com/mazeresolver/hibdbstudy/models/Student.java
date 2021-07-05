package com.mazeresolver.hibdbstudy.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Student {

	@Id
	private int id;
	
	private String name;
	
//	@OneToOne
//	@JoinColumn(name = "s_id")
//	private Passport passport;
	
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
	
	
}
