package com.mazeresolver.hibdbstudy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mazeresolver.hibdbstudy.dao.PassportDao;
import com.mazeresolver.hibdbstudy.dao.StudentDao;
import com.mazeresolver.hibdbstudy.models.Passport;
import com.mazeresolver.hibdbstudy.models.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private PassportDao passportDao;

	@GetMapping("/all-students")
	public List<Student> getStudents() {
		
		return studentDao.getStudents();
	}
	
	@GetMapping("/all-passports")
	public List<Passport> getPassports() {
		
		return passportDao.getPassports();
	}
	
	@PostMapping("/save-all")
	public void saveAll(@RequestBody Student std) {
		studentDao.saveAll(std);
	}
	
	@PutMapping("/save-all")
	public void saveAll(@RequestParam("id") int id,@RequestBody Student std) {
		if(std.getId() == id)
			studentDao.saveAll(std);
		else
			throw new RuntimeException("ID Should match with original data", new Throwable("Generic Error"));
	}
}
