package com.spring.springReactApplication.repository;

import com.spring.springReactApplication.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInitializer implements CommandLineRunner {

    private EmployeeRepository employeeRepository;

    @Autowired
    public DataBaseInitializer(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee("Frodo", "Baggins", "Ring bearer"));
    }
}
