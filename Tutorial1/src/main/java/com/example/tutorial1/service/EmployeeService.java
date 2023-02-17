package com.example.tutorial1.service;

import com.example.tutorial1.domain.model.Employee.Employee;
import com.example.tutorial1.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public void addEmployee(String firstName, String lastName) {
        employeeRepository.save(new Employee(firstName, lastName));
    }
}
