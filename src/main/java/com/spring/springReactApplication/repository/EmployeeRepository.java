package com.spring.springReactApplication.repository;

import com.spring.springReactApplication.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
