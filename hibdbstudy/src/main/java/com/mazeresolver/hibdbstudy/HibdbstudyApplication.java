package com.mazeresolver.hibdbstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.mazeresolver.hibdbstudy.dao.PassportDao;
import com.mazeresolver.hibdbstudy.dao.StudentDao;

@SpringBootApplication
//@ComponentScan(basePackageClasses = {StudentDao.class,PassportDao.class})
public class HibdbstudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibdbstudyApplication.class, args);
	}

}
