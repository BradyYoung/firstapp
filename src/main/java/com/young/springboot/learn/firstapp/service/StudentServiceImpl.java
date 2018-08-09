package com.young.springboot.learn.firstapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.young.springboot.learn.firstapp.dao.StudentRepository;
import com.young.springboot.learn.firstapp.domain.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student getStudent() {
		return studentRepository.getStudent();
	}

}
