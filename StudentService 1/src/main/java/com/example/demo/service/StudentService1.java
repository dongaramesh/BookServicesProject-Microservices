package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService1 {

	@Autowired
	private StudentRepository studentRepository;
	
	public String addStudent(Student student) {
		
		Student student1=studentRepository.save(student);
		if(student1 != null) {
			return "Registration was successfully done";
		}
		
		return "something went wrong";
	}
	
	public String removStudentById(int id) {
		studentRepository.deleteById(id);
		return "deleted student successfully";
	}
}
