package com.mazeresolver.hibdbstudy.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mazeresolver.hibdbstudy.models.Passport;
import com.mazeresolver.hibdbstudy.models.Student;
import com.mazeresolver.hibdbstudy.repos.StudentRepository;

@Service
@Transactional
public class StudentDao {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getStudents() {

		return studentRepository.getStudents();
	}
	
	
}
