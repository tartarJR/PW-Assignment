package com.planetway.assignment.controller;

import com.planetway.assignment.model.Employee;
import com.planetway.assignment.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployeeList() {
        return employeeService.getEmployeeList();
    }
}
