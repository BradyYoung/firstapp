package com.young.springboot.learn.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.young.springboot.learn.firstapp.domain.Student;
import com.young.springboot.learn.firstapp.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getInfo")
	public Student getInfo() {
		return studentService.getStudent();
	}
}
