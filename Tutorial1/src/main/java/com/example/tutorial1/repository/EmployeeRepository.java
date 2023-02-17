package com.example.tutorial1.repository;


import com.example.tutorial1.domain.model.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
