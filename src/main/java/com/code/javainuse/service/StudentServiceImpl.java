package com.code.javainuse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.javainuse.model.Student;
import com.code.javainuse.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServcie {

	@Autowired
	StudentRepository studentRepository;

	@Override
	@Transactional
	// A Proxy is Created that wraps the function retrieve
	// BeginTransaction
	public List<Student> retrieve() {
		List<Student> studentList = (List<Student>) studentRepository.findAll();
		return studentList;
	}
	// Commit Transaction

	@Override
	@Transactional
	// A Proxy is Created that wraps the function insert
	// BeginTransaction
	public String insert(Student student) {
		Student save = studentRepository.save(student); // Call to the Repository
		if (save.getStudentId() == 2) {
			int a = 1 / 0;
			System.out.println("The value of A is : " + a);
		}
		if (save != null) {
			return "The Student is successfully inserted within the database";
		}
		return "Failed to insert Student within the database";
	}
	// Commit Transaction

	@Override
	@Transactional
	// A Proxy is Created that wraps the function delete
	// BeginTransaction
	public String delete(int StudentId) {
		studentRepository.deleteById(StudentId);
		return "The Student is successfully deleted from the database";
	}
	// Commit Transaction

}
