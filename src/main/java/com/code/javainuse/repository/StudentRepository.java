package com.code.javainuse.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.javainuse.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
