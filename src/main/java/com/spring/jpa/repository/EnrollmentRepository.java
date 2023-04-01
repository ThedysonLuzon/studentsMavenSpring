package com.spring.jpa.repository;

import com.spring.jpa.model.Enrollment;
import org.springframework.data.repository.CrudRepository;

public interface EnrollmentRepository extends CrudRepository<Enrollment, Integer> {
}
