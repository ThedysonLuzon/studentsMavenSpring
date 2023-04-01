package com.spring.jpa.repository;

import com.spring.jpa.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}