package com.mazeresolver.hibdbstudy.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mazeresolver.hibdbstudy.models.Passport;
import com.mazeresolver.hibdbstudy.models.Student;

@Repository
public class PassportRepository {
	
	@Autowired
	private EntityManager em;
	
	public List<Passport> getPassports(){
		
		TypedQuery<Passport> query = em.createQuery("from Passport", Passport.class);
		return query.getResultList();
	}

}
