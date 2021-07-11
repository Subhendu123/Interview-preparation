package com.mazeresolver.hibdbstudy.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mazeresolver.hibdbstudy.models.Passport;
import com.mazeresolver.hibdbstudy.models.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	private EntityManager em;
	
	public List<Student> getStudents(){
		
		TypedQuery<Student> query = em.createQuery("from Student", Student.class);
		return query.getResultList();
	}
	
	public void saveAll(Student s){
		em.merge(s);
	}

}
