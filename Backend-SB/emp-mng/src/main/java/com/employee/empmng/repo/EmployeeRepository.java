package com.employee.empmng.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employee.empmng.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
