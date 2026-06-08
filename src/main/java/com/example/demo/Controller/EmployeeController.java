package com.example.demo.Controller;

import com.example.demo.Entities.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
     EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.displayEmployees();
    }

    @PostMapping("/employees")
    public String createEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
}
