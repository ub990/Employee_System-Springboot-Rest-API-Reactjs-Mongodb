package com.example.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeEntity, Long> {
}
