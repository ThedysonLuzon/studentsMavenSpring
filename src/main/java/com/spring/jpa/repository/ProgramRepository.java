package com.spring.jpa.repository;

import com.spring.jpa.model.Program;
import org.springframework.data.repository.CrudRepository;

public interface ProgramRepository extends CrudRepository<Program, Integer> {
}