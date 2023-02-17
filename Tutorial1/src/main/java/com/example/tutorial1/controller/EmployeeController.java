package com.example.tutorial1.controller;

import com.example.tutorial1.domain.model.Employee.Employee;
import com.example.tutorial1.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class EmployeeController {
    Logger logger = new ();
    private final EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/addEmployee")
    public List<Employee> addEmployee(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName
    ) {
        employeeService.addEmployee(firstName, lastName);
        return employeeService.findAllEmployees();
    }
}
